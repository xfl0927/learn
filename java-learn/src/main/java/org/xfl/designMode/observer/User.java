package org.xfl.designMode.observer;

public class User implements Observer {
    private String name;
    private String msg;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        read();
    }

    public void read(){
        System.out.println(name + "收到推送消息:" + msg);
    }


    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        Observer huang = new User("Huang");
        Observer duang = new User("Duang");
        Observer guang = new User("Guang");

        server.registerObserver(huang);
        server.registerObserver(duang);
        server.registerObserver(guang);
        server.setInformation("Hello World!");

    }
}
