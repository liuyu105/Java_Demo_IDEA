package Java_basic.collection;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.number.charAt(0) == o2.number.charAt(0)) {
            //如果两人的号都是A开头或者都是V开头,比较号的大小:
            return o1.number.compareTo(o2.number);
        }
        if (o1.number.charAt(0) == 'V') {
            return -1;
        } else {
            return 1;
        }

    }
}
