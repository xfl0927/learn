package org.xfl.mutiThread;

public class PCTest {
    public static void main(String[] args){
        Share s = new Share();
        Producer p = new Producer(s,1);
        Consumer c = new Consumer(s,1);
        p.start();
        c.start();
    }
}
