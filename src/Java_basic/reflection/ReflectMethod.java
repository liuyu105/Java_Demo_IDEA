package Java_basic.reflection;

public class ReflectMethod {
    public static void main(String[] args) throws NoSuchMethodException {
        Class stdClass = Student_Method.class;
        // 获取public方法getScore，参数为String:
        System.out.println(stdClass.getMethod("getScore", String.class));
        // 获取继承的public方法getName，无参数:
        System.out.println(stdClass.getMethod("getName"));
        // 获取private方法getGrade，参数为int:
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
    }
}

class Student_Method extends Person_Method {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}

class Person_Method {
    public String getName() {
        return "Person";
    }
}
