package org.xfl.designMode.adaptor;

public class GermanSocket implements IGermanSocket {
    @Override
    public void TwoSlot() {
        System.out.println("I'm Two Slot Socket Come From Germany.");
    }

    public void privateMethod(){
        System.out.println("I'm the private method from chinaSocket class");
    }
}
