package Java_basic.reflection;

public class ReflectionDemo {
    public static void main(String[] args) {
        //方法一：直接通过一个class的静态变量class获取
        Class cls = String.class;
        //方法二：如果我们有一个实例变量，可以通过该实例变量提供的getClass()方法获取：
        String s = "Hello";
        Class cls2 = s.getClass();
        //方法三：如果知道一个class的完整类名，可以通过静态方法Class.forName()获取：
        try {
            Class cls3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        boolean sameClass = cls == cls2;
        System.out.println(sameClass);

    }
}
