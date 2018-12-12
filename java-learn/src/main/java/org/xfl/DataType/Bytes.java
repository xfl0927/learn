package org.xfl.DataType;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Bytes {
    public static void main(String[] args){
        getByteSize();
    }
    public static void getByteSize(){
        byte[] anthByte = new byte[1024];
        System.out.println(anthByte.length);
        byte[] bytes;
        String str = "天青色等烟雨天青色等烟雨天青色等烟雨天青色等烟雨天青色等烟雨";
        String english = "I am waiting for you.";
        bytes = str.getBytes();
        InputStream inputStream = new ByteArrayInputStream(bytes);
        Charset.defaultCharset();
        System.out.println("=====================" + english.codePointAt(4));
        System.out.println("Byte size:" + bytes.length);
        String file_separator = System.getProperty("file.separator");
        String path_separator = System.getProperty("path.separator");
        System.out.println(file_separator + " = = = = = =" + path_separator);
    }
}
