package org.xfl.block;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

public class BlockChain {
    public static int difficulty = 5;
    public static ArrayList<Block> blockChain = new ArrayList<>();
    public static void main(String[] args){
        Block fb = new Block("i'm the first","0");
        //System.out.println("Hash for block 1:" + fb.hash);
        Block sb = new Block("i'm the second",fb.hash);
        //System.out.println("Hash for block 2:" + sb.hash);
        Block tb = new Block("i'm the third",sb.hash);
        //System.out.println("Hash for block 3:" + tb.hash);

        blockChain.add(fb);
        System.out.println("Trying to Mine block 1...");
        blockChain.get(0).mineBlock(difficulty);

        blockChain.add(new Block("i'm the second",blockChain.get(blockChain.size() -1).hash));
        System.out.println("Trying to Mine block 2...");
        blockChain.get(1).mineBlock(difficulty);

        blockChain.add(new Block("i'm the third",blockChain.get(blockChain.size() -1).hash));
        System.out.println("Trying to Mine block 3...");
        blockChain.get(2).mineBlock(difficulty);

        System.out.println("\nBlockchain is Valid:" + isChainValid());
        String blockChainJson = JSON.toJSONString(blockChain);
        System.out.println("block chain json:" + blockChainJson);
    }

    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0','0');
        for (int i=1;i< blockChain.size(); i++){
            currentBlock = blockChain.get(i);
            previousBlock = blockChain.get(i-1);
            //compare registered hash and calculated hash
            if (!currentBlock.hash.equals(currentBlock.calculateHash())){
                System.out.println("Current hashes not equal.");
                return false;
            }
            //compare previous hash and registered previous hash
            if (!previousBlock.hash.equals(currentBlock.previousHash)){
                System.out.println("Previous hashes not equal.");
                return false;
            }
            //check if hash is solved
            if (!currentBlock.hash.substring(0,difficulty).equals(hashTarget)){
                System.out.println("This block hasn't been mined");
                return false;
            }

        }
        return true;
    }
}
