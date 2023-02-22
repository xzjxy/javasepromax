package p10_polymorphic;

public class Tortise extends Animal{

    public String name = "子类乌龟";
    @Override
    void run() {
        System.out.println("🐢爬的很慢！");
    }

    public void layeggs(){
        System.out.println("🐢可以下蛋！");
    }
}
