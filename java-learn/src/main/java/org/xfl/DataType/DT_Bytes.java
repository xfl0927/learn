package org.xfl.DataType;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class DT_Bytes {
    public static void main(String[] args){
        DT_Char.maxAndMin();
        DT_Integer.maxAndMin();
        DT_Boolean.maxAndMin();
        DT_Bytes.maxAndMin();
        DT_Double.maxAndMin();
        DT_Long.maxAndMin();
        DT_Float.maxAndMin();
        DT_Short.maxAndMin();
        //getByteSize();
    }
    public static void getByteSize(){
        byte[] bytes;
        String english = "I am waiting for you.";
        System.out.println("String length:" + english.length());
        bytes = english.getBytes();
        InputStream inputStream = new ByteArrayInputStream(bytes);
        Charset.defaultCharset();
        for (int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
            if (i == 4){
                break;
            }
        }
        System.out.println("=====================" + english.codePointAt(4));
        System.out.println("Byte size:" + bytes.length);

    }
    public static void maxAndMin(){
        System.out.println("byte max:" + Byte.MAX_VALUE);
        System.out.println("byte min:" + Byte.MIN_VALUE);
    }

    public static void separator(){
        String file_separator = System.getProperty("file.separator");
        String path_separator = System.getProperty("path.separator");
        System.out.println("file_separator:" + file_separator + " path_separator:" + path_separator);
    }
}
