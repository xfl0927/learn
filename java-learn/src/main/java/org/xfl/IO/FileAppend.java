package org.xfl.IO;

import java.io.*;
import java.math.BigInteger;

public class FileAppend {
    public static void main(String[] args){
        //toBinary(8);
        testOs();
    }
    //在写出的文件前追加
    public static void testOs(){
        InputStream is = getInputStream("D:\\javaWork\\file\\is.txt");
        OutputStream os;
        try {
            os = new FileOutputStream(new File("D:\\javaWork\\file\\os.txt"));
            String head = "10.01.03";
            String[] headArr = head.split("\\.");
            StringBuffer sb = new StringBuffer();
            for (int i = 0;i < headArr.length; i++){
                sb.append(headArr[i]);
            }
            byte[] testInt = new byte[]{
                    Integer.valueOf(headArr[0]).byteValue(),
                    Integer.valueOf(headArr[1]).byteValue(),
                    Integer.valueOf(headArr[2]).byteValue()
            };
            for (int i = 0;i < testInt.length; i++){
                System.out.println(testInt[i]);
            }
            System.out.println("------------------");
            //InputStream headIs = new ByteArrayInputStream(sb.toString().getBytes());
            InputStream headIs = new ByteArrayInputStream(testInt);
            for (int i = 0;i < sb.toString().getBytes().length; i++){
                System.out.println("String:"+ new String(new byte[]{sb.toString().getBytes()[i]},"UTF-8") + "; byte:" + sb.toString().getBytes()[i]);
            }
            //byte[] a = new byte[sb.toString().getBytes().length];
            byte[] a = new byte[testInt.length];
            byte[] b = new byte[1024];
            int num;
            int bNum;
            if (is != null) {
                while ((num = headIs.read(a)) != -1) {
                    os.write(a,0,num);
                }
                while ((bNum = is.read(b)) != -1){
                    os.write(b,0,bNum);
                }
                os.flush();
                os.close();
            }
            InputStream is1 = getInputStream("D:\\javaWork\\file\\os.txt");
            //byte[] b1 = new byte[6];
            byte[] b1 = new byte[testInt.length];
            is1.read(b1);
            //String res = new String(b1);
            int one = b1[0];
            int two= b1[1];
            int three = b1[2];
            System.out.println("one:" + one + "; two:" + two + "; three:" + three);
            //System.out.println("res:" + res);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static InputStream getInputStream(String dir){
        File file = new File(dir);
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return is;
    }
    public static String intToHex(int n){
        StringBuffer s = new StringBuffer();
        String a;
        char[] b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (n != 0){
            s = s.append(b[n%16]);
            n = n/16;
        }
        a = s.reverse().toString();
        return a;
    }
    public static void toBinary(int decimal){
        for (int i = 8;i >=0;i--){
            System.out.print(decimal >>> i & 1);
        }
        System.out.println();
        System.out.println(new BigInteger(String.valueOf(102010)).toString(2));
        System.out.println(decimal >>> 8 & 1);

    }
}
