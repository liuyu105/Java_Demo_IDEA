package Java_basic.multithreading;

public class Counter1 {
    private int count = 0;

    public void add(int n) {
        synchronized (this) {
            count += n;
        }
    }

    //    public void dec(int n) {
//        synchronized (this) {
//            count -= n;
//        }
//    }
    //用synchronized修饰的方法就是同步方法，它表示整个方法都必须用this实例加锁
    public synchronized void dec(int n) {
        count -= n;
    }

    public int get() {
        return count;
    }

}
