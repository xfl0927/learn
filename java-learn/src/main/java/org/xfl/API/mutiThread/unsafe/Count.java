package org.xfl.API.mutiThread.unsafe;/** * @program: learn * @description: 线程不安全的类count * @author: xfl * @create: 2018-07-25 10:13 **/public class Count {    private volatile int num;    public void increment(){        num ++;    }    public int getNum(){        return num;    }}