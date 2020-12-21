import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");//size=1
        list.add("pear"); //size=2
        list.add("banana"); //size=3

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
