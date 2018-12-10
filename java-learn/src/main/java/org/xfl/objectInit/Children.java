package org.xfl.objectInit;/** * @program: learn * @description: 对象初始化, 子类 * @author: xfl * @create: 2018-07-23 10:30 **/public class Children extends Parent{    /**     * 类成员变量     */    public Person person = new Person();    private static String action;    /**     * 子类无参数构造     */    public Children(){        System.out.println("子类无参数构造方法，init");    }    /**     * 子类有参数构造     * @param age     */    public Children(Integer age){        this.age = age;        System.out.println("子类有参构造方法，init");    }    /**     * 子类代码块     */    {        System.out.println("子类代码块，init");    }    /**     * 子类静态代码块     */    static {        action = "action";        staticAction();        System.out.println("子类静态代码块，init");    }    void action(){        System.out.println("子类非静态方法调用:");        staticAction();    }    static void staticAction(){        System.out.println("子类静态方法:init");    }    public static void main(String[] args) {        /**         * 静态代码块初始化，每个静态代码块只会执行一次。         * 由于JVM在加载类时会执行静态代码块和子类静态方法，所以静态代码块先于main方法执行。         * 父类先于子类执行。         */        System.out.println("************进入main函数************");        Children.staticAction();        /**         * 实例化Children,得到一个对象children，其中         * 先执行属性初始化加载Person,Person 静态代码块/代码块/无参构造         * 再执行父类static(已经加载过,这里不加载)/成员变量初始化、无参数代码块和父类无参数构造方法,         * 再执行子类成员变量初始化、无参数代码块和子类无参数构造方法。         */        Children children = new Children();        System.out.println(children.toString());        System.out.println(children.age);        System.out.println(own);        /**         * 由上可见初始化分为JVM加载类时的类初始化(静态代码块)和对象new时的初始化(成员变量、无参数构造函数和构造代码块)         */        /**         * Why: 为啥静态类可以直接调用静态方法         * 因为该类的静态方法是程序启动时自动放在内存中了的，是属于程序的公共内存（但只能访问），而类名在这里你可以理解为命名空间。         * 先通俗的分析下，我们把类看作是一个房子。房子里面有家具，桌椅板凳之类的，房子里面还有人。         * 房子里面所有的人都应该是共有一套家具的。也就是说，这些家具是唯一的，如果某个家具坏了，那么大家都用不了。         * 我们再看一看定义，java的静态变量也叫做类变量，它开始于类的创建，结束于类的消亡。         * 非静态变量叫做实例变量，它开始于类的实例的创建，结束语类的实例的消亡。静态变量被所有实例所共享。         * 也就是如上面的例子，座椅板凳是类变量，它们是在房子被建好了之后就被添加放置进来，而且基本都是唯一的。         * 人就相当于实例，每个人都能用这些家具，但是如果家具一旦损坏，那就是坏了，或者你把某一个家具搬走，那么所有的人都用不了这个家具，房子里也不存在这个家具了。         * 但是房子里可以进很多人，可以进张三，也可以进李四。所以这些人就是类的实例对象，他们身上穿的衣服就可以叫做实例变量。         * 如果一个类中有静态变量的话，程序首先会把该静态变量加载进内存中，也就是在堆中开辟一个区域专门存放。以后不管你new多少个类的对象，该静态变量永远都是在那里的。         * 也就是说，静态变量在类的初始化一次后，系统就不会为该变量开辟新的内存空间。而每new一个类的对象，系统就会重新在堆内存中开辟一个新空间来存放该类的实例对象，并且栈中也会有一个新的引用变量去指向它。         * 静态方法也是类似，但是有一点要强调，静态方法中不能调用非静态方法。因为被static修饰的方法会首先被Classloader对象先加载进内存，而这个时候可能其它的非静态方法或者变量还没有被加载进来。         * 就好比我现在想做包子，现在面粉被static修饰，首先已经拿到你身边，可是因为包子馅不是static修饰的，所以可能包子馅儿还没运过来，你说怎么做的出包子呢。         * 被static修饰过的都是随着类的初始化后就产生了，在堆内存中都有一块专门的区域来存放，所以只需要类名点方法名或者变量名即可。         * 而非静态的就必须通过类的对象去调相应的。就像是你想要红色的衣服，你必须是从穿红色的衣服的人的身上拿过来才行，所以你必须找到穿红色衣服的人，也就是类的实例对象，而你如果要去找一个桌子，而桌子就在房间里摆着，你只要进到房间里直接走过去拿来就可以了         *         * static 关键字的用途：方便在没有创建对象的情况下来进行调用(方法/变量)         */        System.out.println(Thread.currentThread().getStackTrace());    }}