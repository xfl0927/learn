package org.xfl.mutiThread;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Consumer extends Thread {
    private Share share;
    private int number;
    public Consumer(Share share,int number){
        this.share = share;
        this.number = number;
    }
    public void run(){
        int value = 0;
        for (int i = 0;i<10;i++){
            value = share.getContents();
            System.out.println("消费者" + this.number + "得到的数据为：" + value);
        }
        try {
            sleep((long) (Math.random()*100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
