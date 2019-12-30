package org.xfl.binary;

public class BinaryOperation {
    public static void main(String[] args){
        yuOperation();
        huoOperation();
        fanOperation();
        yiHuoOperation();
        //leftOperation();
        //rightOperation();
        //unsignedRightOperation();

    }

    // <p> & </p> 两位同为1 才为1
    public static void yuOperation(){
        System.out.println("2 binary value:" + Integer.toBinaryString(2));
        System.out.println("3 binary value:" + Integer.toBinaryString(3));
        int res = 2&3;
        System.out.println("2&3 binary value:" +Integer.toBinaryString(res));
        System.out.println("2&3 int value:" + res);
    }
    // <p> | </p> 只要有1 则为1
    public static void huoOperation(){
        System.out.println("2 binary value:" + Integer.toBinaryString(2));
        System.out.println("3 binary value:" + Integer.toBinaryString(3));
        int res = 2 | 3;
        System.out.println("2|3 binary value:" +Integer.toBinaryString(res));
        System.out.println("2|3 int value:" + res);
    }
    // <p> ~ </p> 取反 1->0  0->1
    public static void fanOperation(){
        System.out.println("3 binary value:" + Integer.toBinaryString(3));
        int res =  ~3;
        System.out.println("~3 binary value:" +Integer.toBinaryString(res));
        System.out.println("~3 int value:" + res);
    }
    // <p> ^ </p> 相同为0 不同为1
    public static void yiHuoOperation(){
        System.out.println("2 binary value:" + Integer.toBinaryString(2));
        System.out.println("3 binary value:" + Integer.toBinaryString(3));
        int res = 2 ^ 3;
        System.out.println("2^3 binary value:" +Integer.toBinaryString(res));
        System.out.println("2^3 int value:" + res);
    }
    // <p> << </p>
    public static void leftOperation(){
        System.out.println("20 binary value:" + Integer.toBinaryString(20));
        int res = 20 << 8;
        System.out.println("20 << 8 binary value:" +Integer.toBinaryString(res));
        System.out.println("20 << 8 int value:" + res);
        System.out.println("20 * 2的8次方:" + 20 * (int)Math.pow(2,8));
    }
    // <p> >> </p>
    public static void rightOperation(){
        System.out.println("613 binary value:" + Integer.toBinaryString(613));
        //int res = -613 >> 8;
        int res = 613 >> 8;
        System.out.println("613 >> 8 binary value:" +Integer.toBinaryString(res));
        System.out.println("613 >> 8 int value:" + res);
        System.out.println("613 / 2的8次方 余数:" + (613/(int) Math.pow(2,8)));

    }
    // <p> >>> </p>
    public static void unsignedRightOperation(){
        System.out.println("-613 binary value:" + Integer.toBinaryString(-613));
        int res = -613 >>> 8;
        //int res = 613 >>> 8;
        System.out.println("-613 >>> 8 binary value:" +Integer.toBinaryString(res));
        System.out.println("-613 >>> 8 int value:" + res);
    }
}
