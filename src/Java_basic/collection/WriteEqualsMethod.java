package Java_basic.collection;

import java.util.Arrays;
import java.util.List;

public class WriteEqualsMethod {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Xiao Ming"),
                new Person("Xiao Hong"),
                new Person(null)
        );
        System.out.println(list.contains(new Person(null))); // false
    }
}
