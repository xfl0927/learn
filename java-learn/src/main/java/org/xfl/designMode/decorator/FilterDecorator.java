package org.xfl.designMode.decorator;

public class FilterDecorator extends AbstractDoor {
    protected AbstractDoor door;

    protected FilterDecorator(AbstractDoor door) {
        this.door= door;
    }

    @Override
    public void open() {
        door.open();
    }

    @Override
    public void close() {
        door.close();
    }
}
