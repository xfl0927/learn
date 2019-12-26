package org.xfl.block;

import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;//our data will be a simple message
    private long timeStamp; //as number of milliseconds since 1/1/1970
    private int nonce;

    public Block(String previousHash, String data) {
        this.previousHash = previousHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();//making sure we do this after we set the other values.
    }
    //calculate new hash based on blocks contents
    public String calculateHash(){
        return SignUtil.applySha256(this.previousHash + Long.toString(timeStamp) + data);
    }

    public void mineBlock(int difficulty){
        //create a string with difficulty * '0'
        String target = new String(new char[difficulty]).replace('\0','0');
        while (!hash.substring(0,difficulty).equals(target)){
            this.nonce ++ ;
            hash = calculateHash();
        }
        System.out.println("Block mined!!:" + hash);
    }
}
