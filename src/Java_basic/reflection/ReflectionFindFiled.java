package Java_basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionFindFiled {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stdClass = Student.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        //获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        //获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));
        Field f=String.class.getDeclaredField("value");
        System.out.println(f.getName()+"\n"+f.getType());
        int m=f.getModifiers();
        Modifier.isFinal(m);
    }
}

class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}