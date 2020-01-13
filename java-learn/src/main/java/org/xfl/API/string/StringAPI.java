package org.xfl.API.string;

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

        // 常量池
        // static class
        A instanceA = new A();
        B instanceB = new B();
        //string ==
        System.out.println(instanceA.A_a == instanceB.B_a);//true
        //integer ==
        System.out.println(instanceA.A_int == instanceB.B_int);//true

        System.out.println("------");
        InstanceA ia = new InstanceA(128);
        InstanceB ib = new InstanceB(128);
        System.out.println(ia.A_str == ib.B_str); //true
        System.out.println(ia.A_int == ib.B_int);//true
        System.out.println(ia.A_con_int == ib.B_con_int);//false

        System.out.println("------");
        Integer i = 128;
        Integer in = 128;
        System.out.println(i == in);
        System.out.println(i == ia.A_con_int);

        char[] chars = a.toCharArray();
        for (char ch:chars){
            System.out.println(ch);
        }
    }
    static class A {
        String A_a = "泡泡龙";
        Integer A_int = 2;
    }
    static class B {
        String B_a = "泡泡龙";
        Integer B_int = 2;
    }
}
