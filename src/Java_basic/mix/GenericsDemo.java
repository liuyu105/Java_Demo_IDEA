package Java_basic.mix;

import java.util.Arrays;

public class GenericsDemo {
    public static void main(String[] args) {
        Person[] ps = new Person[]{new Person("Bob", 61), new Person("Alice", 88),
                new Person("Lily", 75)};
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person> {
    String name;
    int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    public String toString() {
        return this.name + "," + this.score;
    }
}

