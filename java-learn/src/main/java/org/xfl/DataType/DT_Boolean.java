package org.xfl.DataType;

public class DT_Boolean {
    public static void maxAndMin(){
        System.out.println("Max boolean:" + true);
        System.out.println("Min boolean:" + false);
    }
    public static void orAndGate(){
        boolean res = Boolean.logicalAnd(true,true);
        boolean res1 = Boolean.logicalXor(true,false);
        System.out.println(res1);
    }
}
