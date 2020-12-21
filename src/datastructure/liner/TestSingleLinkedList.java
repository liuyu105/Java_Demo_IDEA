package datastructure.liner;

import datastructure.liner.array.List;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        List list=new SingleLinkedList();
        list.add(123);
        list.add(234);
        list.add("233");
        list.add(238);
        list.add(234);
        list.add("233");
        list.add(238);

        list.add(3,666);
        list.addAfter(3,111);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(2));
        System.out.println(list.toString());
        System.out.println(list.contains(238));
        System.out.println(list.indexOf(234));
        System.out.println(list.remove(1));
        System.out.println(list.toString());
        System.out.println(list.remove("233"));
        System.out.println(list.toString());
    }
}
