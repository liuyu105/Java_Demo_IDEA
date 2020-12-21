package Java_basic.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
//        //创建一个FileReader对象:
//        Reader reader = new FileReader("F:\\testgit\\test.txt");
//        while (true) {
//            int n = reader.read(); // 反复调用read()方法，直到返回-1
//            if (n == -1) {
//                break;
//            }
//            System.out.println((char) n); // 打印char
//        }
//        reader.close(); // 关闭流
        FileReaderDemo.readFile();
    }

    public static void readFile() throws IOException {
        //使用InputStreamReader进行FileInputStream与Reader的转换
        try (Reader reader = new InputStreamReader(new FileInputStream("F:\\testgit\\test.txt"), "UTF-8")) {
            //try (Reader reader = new FileReader("F:\\testgit\\test.txt")) {
            char[] buffer = new char[1000];
            int n;
            while ((n = reader.read(buffer)) != -1) {
                System.out.println("read " + n + " chars.");
            }
        }
    }
}
