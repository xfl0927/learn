package org.xfl.schema.decorator;

public class ConcreteDoor1 extends AbstractDoor {
    @Override
    public void open() {
        System.out.println("Open the Door by one.");
    }

    @Override
    public void close() {
        System.out.println("Close the Door by one.");
    }
}
