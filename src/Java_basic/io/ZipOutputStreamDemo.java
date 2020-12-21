package Java_basic.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String zipFile = "F:\\testgit\\testgit.zip";
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile))) {
            File file0 = new File("F:\\testgit");
            File[] files = file0.listFiles();
            for (File file : files) {
                zip.putNextEntry(new ZipEntry(file.getName()));
                //zip.write(getFileDataAsBytes(file));
                zip.closeEntry();
            }
        }
    }
}
