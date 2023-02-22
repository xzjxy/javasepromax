package d18_system;

public class BigDecimal {
    // 解决浮点类型运算失真的问题
    public static void main(String[] args) {
        // 浮点型运算 + - * / 运算存在问题
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);

        System.out.println("------------------");
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("------------------");

        // 解决方法： 包装浮点数为 大数据类型解决失真问题
        BigDecimal a1 = BigDecimal.

    }
}
