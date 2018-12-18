package org.xfl.designMode.decorator;

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
     * 亦为多态的灵活应用(方法的重写)
     * 最复杂的事物都是由最简单的元素组成的
     *
     * OOP(Object Oriented Programming):
     * 人类 Class 环境 Class
     * 张三、李四 都是人类，具有听、说、读、写、性格、穿衣服、吃饭等行为；
     * 这就有了继承。
     * 其中听、说、读、写为meta行为，其经过环境Class的行为的影响，会形成不同的性格、穿衣、吃饭等行为(即是对父类method的重写),也拥有了不同的生存技能；
     * 这就产生了多态.
     * 其中性格是私有，通过听、读和环境会产生不同的性格，性格是复杂的不可直接获取的，
     * 但是通过张三、李四的穿衣、吃饭、说话能间接的判断获取其性格属性信息；
     * 这就产生了封装。
     *
     */
    public static void main(String[] args){
        AbstractDoor zero = new AddedStatus(new ConcreteDoor1());
        zero.open();
        zero.close();
    }
}
