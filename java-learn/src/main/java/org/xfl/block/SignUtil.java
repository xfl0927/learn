package org.xfl.block;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SignUtil {
    public static String applySha256(String input){
        try {
            //applies Sha256 to a String and return the result
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //applies sha256 to our input
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            //this will contain hash as hexadecimal
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length ; i++){
                // & 0xff
                //System.out.println("origin int:" + hash[i] + " &0xff:" + (0xff & hash[i]));
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1){
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
