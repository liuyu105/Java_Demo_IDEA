package Java_basic.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamDemo.writeFile();

        //ByteArrayOutputStream可以在内存中模拟一个OutputStream
        byte[] data;
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            output.write("Hello ".getBytes("UTF-8"));
            output.write("world".getBytes("UTF-8"));
            data = output.toByteArray();
        }
        System.out.println(new String(data, "UTF-8"));
    }

    public static void writeFile() throws IOException {
//        OutputStream output = new FileOutputStream("F:\\testgit\\test1.txt");
//        output.write(72); // H
//        output.write(101); // e
//        output.write(108); // l
//        output.write(108); // l
//        output.write(111); // o
//        output.close();
        try (OutputStream output = new FileOutputStream("F:\\testgit\\test1.txt")) {
            output.write("Hello".getBytes("UTF-8"));
        }// 编译器在此自动为我们写入finally并调用close()
    }
}
