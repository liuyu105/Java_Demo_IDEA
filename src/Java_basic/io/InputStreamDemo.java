package Java_basic.io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStreamDemo.readFile();
        InputStreamDemo.readFileByBuffer();

        //ByteArrayInputStream可以在内存中模拟一个InputStream
        byte[] data = { 72, 101, 108, 108, 111, 33 };
        try(InputStream input=new ByteArrayInputStream(data)){
            int n;
            while ((n=input.read())!=-1){
                System.out.print((char)n);
            }
        }
    }

    public static void readFile() throws IOException {
        InputStream input = null;
        try {
            input = new FileInputStream("F:\\testgit\\test.txt");
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        } finally {
            if (input != null) input.close();
        }
    }

    //Java 7引入的新的try(resource)的语法，只需要编写try语句，让编译器自动为我们关闭资源。
    public static void readFileByJava7() throws IOException {
        try (
                InputStream input = new FileInputStream("F:\\testgit\\test.txt")) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        }// 编译器在此自动为我们写入finally并调用close()
    }

    //利用缓冲读取文件
    public static void readFileByBuffer() throws IOException {
        try (
                InputStream input = new FileInputStream("F:\\testgit\\test.txt")) {
            // 定义1000个字节大小的缓冲区:
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input.read(buffer)) != -1) {
                System.out.println("read " + n + " bytes.");
            }
        }
    }

}
