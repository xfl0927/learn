package org.xfl.mutiThread;

public class Share {
    private Integer contents;
    private boolean available = false;
    public synchronized Integer getContents() {
        while (!available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        //通知所有set等待线程 可以设置数据
        notifyAll();
        return contents;
    }

    public synchronized void setContents(Integer contents) {
        while (available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = true;
        this.contents = contents;
        //通知所有get等待线程 可以获取数据
        notifyAll();
    }
}
