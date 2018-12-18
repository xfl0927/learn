package org.xfl.designMode.observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observable {
    private List<Observer> observers;
    private String msg;

    public WechatServer() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observers.isEmpty())
            observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.update(msg);
        }
    }

    public void setInformation(String msg){
        this.msg = msg;
        System.out.println("Wechat服务更新消息:" + msg);
        notifyObserver();
    }
}
