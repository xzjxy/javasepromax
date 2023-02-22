package p10_polymorphic;

public class Dog extends Animal{
    public String name = "子类狗";
    @Override
    void run() {
        System.out.println("🐕跑的很快！");
    }

    void LookDoor(){
        System.out.println("🐕可以看门！");
    }
}
