package Java_basic.oop;

public class StringDemo {
    public static void main(String[] args) {
        String a="hello";
        System.out.println(a.isEmpty());
        String s = "Hi %s, your score is %d!";
        //System.out.println(s.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));


        System.out.println();
    }
}
