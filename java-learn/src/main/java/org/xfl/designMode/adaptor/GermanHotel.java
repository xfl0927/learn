package org.xfl.designMode.adaptor;

public class GermanHotel {
    private IGermanSocket socket;

    public GermanHotel(IGermanSocket socket) {
        this.socket = socket;
    }

    public void change () {
        socket.TwoSlot();
    }

    public static void main(String[] args){
        GermanHotel germanHotel = new GermanHotel(new SocketAdapter(new ChinaSocket()));
        germanHotel.change();

        GermanHotel germanHotel1 = new GermanHotel(new GermanSocket());
        germanHotel1.change();

        IGermanSocket test = new SocketAdapter(new ChinaSocket());
        ((SocketAdapter) test).childrenMethod();

        //TODO int i = 0; i = i++; why i value aways is 0
        int i = 0;
        int k = 10;
        int g = 0;
        while (k-- > 0){
            i++;
            g = i;
        }
        System.out.println(g);

        IGermanSocket testChildMethod = new GermanSocket();
        ((GermanSocket) testChildMethod).privateMethod();
    }
}
