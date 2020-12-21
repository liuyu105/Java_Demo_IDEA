package Java_basic.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String zipFile = "F:\\testgit\\testgit.zip";
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(zipFile))) {
            //一个ZipEntry表示一个压缩文件或目录
            ZipEntry entry = null;
            while ((entry = zip.getNextEntry()) != null) {
                String name = entry.getName();
                //如果是文件，则进行读取
                if (!entry.isDirectory()) {
                    int n;
                    while ((n = zip.read()) != -1) {
                        System.out.print((char) n);
                    }
                }
            }
        }
    }
}
