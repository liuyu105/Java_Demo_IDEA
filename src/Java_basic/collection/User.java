package Java_basic.collection;

public class User {
    public final String name;//用户名
    public final String number; //编号

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name+"/"+number;
    }
}
