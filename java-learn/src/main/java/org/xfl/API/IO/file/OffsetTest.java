package org.xfl.API.IO.file;import java.io.*;/** * @program: learn * @description: * @author: xfl * @create: 2019-05-08 14:38 **/public class OffsetTest {    public static void main(String[] args){        String target = "Hello World!";        try {            InputStream inputStream = new ByteArrayInputStream(target.getBytes());            DataInputStreamTest inputStreamTest = new DataInputStreamTest(inputStream);            char res = inputStreamTest.readChar();            System.out.println("res char:" + res);            OutputStream outputStream = new ByteArrayOutputStream(20);            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);            dataOutputStream.writeChar(res);            /*int a = targetBytes.length << 8;            int b = targetBytes.length;            if (b == ((a >> 8))) {                System.out.println("YES");                System.out.println("b.length:" + (b));                System.out.println("offset right:" + (a));                System.out.println("offset left:" + (a >> 8));                byte aChar = targetBytes[0];                byte bChar = targetBytes[1];                System.out.println("aChar :" + aChar + " ,bChar :" + bChar);                System.out.println("offset char :" + (char)aChar + (char)bChar);                System.out.println("A char:" + "----" + (char)( (aChar << 8) + (bChar << 0) ));            }else {                System.out.println("NO");            }*/        } catch (FileNotFoundException e) {            e.printStackTrace();        } catch (IOException e) {            e.printStackTrace();        }    }}