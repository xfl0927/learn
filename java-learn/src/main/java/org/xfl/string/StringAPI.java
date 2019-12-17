package org.xfl.string;

public class StringAPI {
    public static void main(String[] args){
        //运行时确定 heap中
        String a = new String("泡泡龙");
        //编译时确定 在字符串常量池中
        String b = "泡泡龙";
        System.out.println(a == b);//false

        //同b 当常量池中已有 "泡泡龙" 时, c指向常量池中的 "泡泡龙"
        String c = "泡泡龙";
        System.out.println(c == b);//true

        //intern 把a字符串的值拘留到字符串常量池中 并返回一个新的字符串对象
        System.out.println(a.intern() == b);//true

        char[] chars = a.toCharArray();
        for (char ch:chars){
            System.out.println(ch);
        }
    }
}
