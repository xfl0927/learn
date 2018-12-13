package org.xfl.schema.decorator;

public class AddedStatus extends FilterDecorator {

    public AddedStatus(AbstractDoor door) {
        super(door);
    }

    @Override
    public void open(){
        door.open();
        addedStatus();
    }

    private void addedStatus() {
        System.out.println("Added status for door.");
        System.out.println("--------------I'm separator for added status method--------------------");
    }


    /**
     * 装饰者和被装饰者需要继承同一个接口或抽象类，两者为组合关系。
     * 亦为多态的灵活应用
     */
    public static void main(String[] args){
        AbstractDoor zero = new AddedStatus(new ConcreteDoor1());
        zero.open();
        zero.close();
    }
}
