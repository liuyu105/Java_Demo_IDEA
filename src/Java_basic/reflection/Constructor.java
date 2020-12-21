package Java_basic.reflection;

public class Constructor {
    public static void main(String[] args) throws Exception {
        //获取构造方法Integer(int):
        java.lang.reflect.Constructor<Integer> cons1 = Integer.class.getConstructor(int.class);
        //调用构造方法
        Integer n1=(Integer)cons1.newInstance(123);
        System.out.println(n1);

        // 获取构造方法Integer(String)
        java.lang.reflect.Constructor<Integer> cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);
    }
}
