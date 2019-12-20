package org.xfl.mutiThread;

public class Producer extends Thread{
    private Share share;
    private int number;

    public Producer(Share share, int number) {
        this.share = share;
        this.number = number;
    }

    public void run(){
        for (int i = 0;i < 10; i++){
            share.setContents(i);
            System.out.println("生产者" + this.number + "输入数据为：" + i);
            try {
                sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
