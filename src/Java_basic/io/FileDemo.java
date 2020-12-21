package Java_basic.io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //构建File对象，传入文件路径
        //Java字符串中需要用\\表示一个\，Linux平台使用/作为路径分隔符
        File f = new File("F:\\testgit\\test.txt");
        System.out.println(f);

        //构造File对象时，既可以传入绝对路径，也可以传入相对路径。
        //绝对路径是以根目录开头的完整路径
        //传入相对路径时，相对路径前面加上当前目录就是绝对路径
        // 假设当前目录是C:\Docs
        File f1 = new File("sub\\javac"); // 绝对路径是C:\Docs\sub\javac
        File f2 = new File(".\\sub\\javac"); // 绝对路径是C:\Docs\sub\javac
        File f3 = new File("..\\sub\\javac"); // 绝对路径是C:\sub\javac
        File f3_5 = new File("../sub/javac"); // 绝对路径是C:\sub\javac
        //返回构造方法传入的路径
        System.out.println(f3.getPath());
        //返回绝对路径
        System.out.println(f3.getAbsolutePath());
        //返回的是规范路径
        try {
            System.out.println(f3_5.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //isFile()，判断该File对象是否是一个已存在的文件
        System.out.println(f.isFile());
        //isDirectory()，判断该File对象是否是一个已存在的目录
        System.out.println(f.isDirectory());
        //文件是否可读、可写、可执行、字节大小
        System.out.println(f.canRead() + " " + f.canWrite() + " " + f.canExecute() + " " + f.length());

        //创建/删除文件
        File f4 = new File("F:\\testgit\\hello.txt");
        if (f4.createNewFile()) {
            System.out.println("创建文件4成功");
            if (f4.delete()) {
                System.out.println("删除文件4成功");
            }
        }

        //createTempFile()来创建一个临时文件
        //deleteOnExit()在JVM退出时自动删除该文件
        File f_temp = File.createTempFile("tmp-", ".txt");
        f_temp.deleteOnExit(); // JVM退出时自动删除
        System.out.println(f_temp.isFile());
        System.out.println(f_temp.getAbsolutePath());

        //遍历文件和目录
        File f_list = new File("F:\\liuyu");
        File[] fs1 = f_list.listFiles(); // 列出所有文件和子目录
        printFiles(fs1);
        File[] fs2 = f_list.listFiles(new FilenameFilter() {
            //仅列出.txt文件
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        printFiles(fs2);

        //Path对象
        //如果需要对目录进行复杂的拼接、遍历等操作，使用Path对象更方便。
        Path p1 = Paths.get(".", "project", "study");
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath(); // 转换为绝对路径
        System.out.println(p2);
        Path p3 = p2.normalize(); // 转换为规范路径
        System.out.println(p3);
        File f_path = p3.toFile(); // 转换为File对象
        System.out.println(f_path);
        for (Path p : Paths.get("..").toAbsolutePath()) { // 可以直接遍历Path
            System.out.println("  " + p);
        }

    }

    static void printFiles(File[] files) {
        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }
}
