package d13_api_object;

public class Test {
    // toString 默认返回对象在 堆内存 地址， 重写后可以返回对象内容
    public static void main(String[] args) {
        Student s = new Student("张三", '男', 20);
        // 未重写前返回对象地址
        System.out.println(s); // d13_api_object.Student@27d6c5e0
        System.out.println(s.toString()); // d13_api_object.Student@27d6c5e0

        // 重写后,
        System.out.println(s.toString()); // Student{name='张三', sex=男, age=20}
        System.out.println(s); // Student{name='张三', sex=男, age=20}
    }
}
