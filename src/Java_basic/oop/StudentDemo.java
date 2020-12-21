package Java_basic.oop;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        Person p=new Student();
        System.out.println(s instanceof Student);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student);
    }

}
