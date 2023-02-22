package p10_polymorphic;

public class Test {
    // 多态 子类对象执行同一个行为表现不同状态
    public static void main(String[] args) {
        // 常见形式 ： 1 父类 对象名词 = new 子类构造器
        /**
         方法： 编译看左边， 运行看右边 （多态侧重行为）
         变量：编译看左边， 运行也看左边
         */
        Animal a1 = new Dog();
        a1.run();
        System.out.println(a1.name); // 父类结果
//        a1.lookdoor;  // 多态下无法使用 子类的  独有功能

        // 强制对象类型转换后可以使用独有功能
        a1 = (Dog) a1;
        ((Dog) a1).LookDoor();

        Animal a2 = new Tortise();
        a2.run();
        System.out.println(a2.name); // 父类结果
//        a2.layeggs();
        a2 = (Tortise) a2;
        ((Tortise) a2).layeggs();
        // 强转编译不报错，运行会报错   使用 instanceof 判断类， 是返回true， 不是返回 false

        if(a2 instanceof Tortise){
            ((Tortise) a2).layeggs();
        }else if(a2 instanceof Dog){
            ((Dog) a1).LookDoor();
        }


        // 2 接口 对象名称 = new 实例类构造器

    }
}
