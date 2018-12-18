package org.xfl.designMode.decorator;

public class ConcreteDoor0 extends AbstractDoor {

    @Override
    public void open() {
        System.out.println("Open the door by zero.");
    }

    @Override
    public void close() {
        System.out.println("Close the door by one.");
    }
}
