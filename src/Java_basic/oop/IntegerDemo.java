package Java_basic.oop;

public class IntegerDemo {
    public static void main(String[] args) {
        int i = 100;
        Integer n1 = new Integer(i);
        Integer n2 = Integer.valueOf(i);
        Integer n3 = Integer.valueOf("120");
        System.out.println(n3.intValue());
    }
}
