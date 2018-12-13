package org.xfl.schema.decorator;

public class AddedType extends FilterDecorator {
    protected AddedType(AbstractDoor door) {
        super(door);
    }

    @Override
    public void open(){
        door.open();
        addedType();
    }

    private void addedType(){
        System.out.println("Added type for door.");
        System.out.println("--------------I'm separator for added type method--------------------");
    }

}
