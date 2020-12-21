package Java_basic.collection;

import java.util.Objects;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    //使用普通equals方法
//    public boolean equals(Object o) {
//        if (o instanceof Person) {
//            Person p = (Person) o;
//            boolean nameEquals = false;
//            if (this.name == null && p.name == null) {
//                nameEquals = true;
//            }
//            if (this.name != null) {
//                nameEquals = this.name.equals(p.name);
//            }
//            return nameEquals && this.age == p.age;
//        }
//        return false;
//    }
    //使用Objects.equals()静态方法
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
//        int h = 0;
//        //反复使用31*h，这样做的目的是
//        //为了尽量把不同的Person实例的hashCode()均匀分布到整个int范围。
//        h = 31 * h + name.hashCode();
//        h = 31 * h + age;
//        return h;
        //如果name为null，上述代码工作起来就会抛NullPointerException。
        return Objects.hash(name, age);
    }

    public String toString() {
        return "{Person: " + name + "}";
    }

}
