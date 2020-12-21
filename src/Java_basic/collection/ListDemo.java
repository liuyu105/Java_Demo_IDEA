package Java_basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //1.List的特点：可以重复值；添加null
        List<String> list = new ArrayList<>();
//        list.add("apple");//size=1
//        list.add("pear"); //size=2
//        list.add("apple"); //size=3
//        list.add(null); //size=4
//        System.out.println(list.size());
//        System.out.println(list);

        //2.创建List
//        List<Integer> list = List.of(1, 2, 5);
//        System.out.println(list);

        //3.遍历List
        //1)for+索引
        list.add("apple");//size=1
        list.add("pear"); //size=2
        list.add("banana"); //size=3
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            System.out.println(s);
//        }
        //2)使用迭代器Iterator来访问List
//        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
//            String s = it.next();
//            System.out.println(s);
//        }
        //使用for each来访问List
//        for (String s : list
//        ) {
//            System.out.println(s);
//        }

        //4.List和Array的转换
        //1）toArray()
//        Object[] array=list.toArray();
//        for (Object s:array){
//            System.out.println(s);
//        }
        //2)给toArray(T[])传入一个类型相同的Array，List内部自动把元素复制到传入的Array中
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(5);
        Integer[]array=list1.toArray(new Integer[1]);
        for (Integer n:array){
            System.out.println(n);
        }
        Integer[] array1 = { 1, 2, 3 };
        List<Integer> list2 = Arrays.asList(1,2,3);
        System.out.println(list2);
    }
}
