package datastructure.liner.array;

public class TestArrayList {
    public static void main(String[] args) {
        java.util.ArrayList list1;
        List list=new ArrayList();
        list.add(123);
        list.add(234);
        list.add(233);
        list.add(238);
        list.add(234);
        list.add(233);
        list.add(238);

        list.add(3,666);
        list.addAfter(3,111);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(3));
        System.out.println(list.toString());
        System.out.println(list.contains(238));
        System.out.println(list.indexOf(234));
        System.out.println(list.remove(1));
        System.out.println(list.toString());



    }
}
