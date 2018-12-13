package org.xfl.schema.adaptor;

public class SocketAdapter implements IGermanSocket {

    protected IChinaSocket socket;

    public SocketAdapter(IChinaSocket socket) {
        this.socket = socket;
    }

    @Override
    public void TwoSlot() {
        socket.ThreeSlot();
    }

    public void childrenMethod(){
        System.out.println("I'm children's method.");
    }
}
