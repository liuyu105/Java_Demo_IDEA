package mix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DhDemo {
    public static void main(String[] args) {
        System.out.println("Alice和Bob确定一个4位的随机大素数n, 5位的随机大素数g");
        //获得一个 4 位数的随机大素数
        long longPrimeVar4_n = createRadomPrimeNunber(4);
        System.out.println("n=" + longPrimeVar4_n);
        //获得一个 5 位数的随机大素数
        long longPrimeVar5_g = createRadomPrimeNunber(5);
        System.out.println("g=" + longPrimeVar5_g);
        //获得一个 4 位的随机大数
        long longVar4_x = createRandomNumber(3);
        System.out.println("Alice选择一个3位的大随机数x=" + longVar4_x);
        //获得一个 5 位的随机大数
        long longVar5_y = createRandomNumber(3);
        System.out.println("Bob选择一个3位的大随机数y=" + longVar5_y);
        //计算 A,B
        Long A = (long) largeMOD(longPrimeVar5_g, longVar4_x, longPrimeVar4_n);
        System.out.println("Alice根据x计算出A=" + A + "并发给Bob");
        Long B = (long) largeMOD(longPrimeVar5_g, longVar5_y, longPrimeVar4_n);
        System.out.println("Bob根据y计算出B=" + B + "并发给Alice");
        //计算 K1，K2
        long K1 = (long) largeMOD(B, longVar4_x, longPrimeVar4_n);
        System.out.println("Alice根据B计算出密钥K1=" + K1);
        long K2 = (long) largeMOD(A, longVar5_y, longPrimeVar4_n);
        System.out.println("Bob根据A计算出密钥K2=" + K2);
        //判断 K1 是否等于 k2
        if (K1 == K2) {
            System.out.println("K1=K2");
        } else {
            System.out.println("error");
        }
    }

    //  产生随机的大素数
    public static long createRadomPrimeNunber(int n) {
        long recLong = 0;
        List list = listAllPrimeNumber(n);
        Random rd = new Random();
        int randomIndex = Math.abs(rd.nextInt() % list.size());
        recLong = ((Long) list.get(randomIndex)).longValue();
        return recLong;
    }

    public static List listAllPrimeNumber(int n) {
        List list = new ArrayList();
        long low = (long) Math.pow(10, n - 1);
        long high = (long) Math.pow(10, n) - 1;
        for (long i = low; i < high; i++) {
            if (isPrimeNumber(i)) {
                list.add(new Long(i));
            }
        }
        return list;
    }

    //定义一个判断一个数是否是素数的函数
    public static boolean isPrimeNumber(long x) {
        if (isProbablePrime(x))
            return true;
        else
            return false;
    }

    private static boolean isProbablePrime(long x) {
        return true;
    }

    //产生大的随机数
    public static long createRandomNumber(int n) {
        long recLong = 0;
        List list = listAllPrimeNumber(n);
        Random rd = new Random();
        int randomIndex = Math.abs(rd.nextInt() % list.size());

        recLong = ((Long) list.get(randomIndex)).longValue();
        return recLong;
    }

    public static List listAllNumber(int n) {
        List list2 = new ArrayList();
        long low = (long) Math.pow(10, n - 1);
        long high = (long) Math.pow(10, n) - 1;
        for (long i = low; i < high; i++) {
            list2.add(new Long(i));
        }
        return list2;
    }

    public static double largeMOD(long x, long y, long z) {
        if (y == 1) return x % z;
        else {
            --y;
            return ((x % z) * largeMOD(x, y, z)) % z;
        }
    }

}
