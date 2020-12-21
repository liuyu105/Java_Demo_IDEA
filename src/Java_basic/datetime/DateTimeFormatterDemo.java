package Java_basic.datetime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        //DateTimeFormatter基本用法
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);//2020-12-15T14:10:14.679+08:00[GMT+08:00]
        //创建DateTimeFormatter方法一:传入格式化字符串
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println(formatter.format(zdt));//2020-12-15 14:10
        //创建DateTimeFormatter方法二:传入格式化字符串，同时指定Locale
        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("E, yyyy-MMMM-dd HH:mm", Locale.US);
        System.out.println(usFormatter.format(zdt)); //Tue, 2020-December-15 14:10

        //默认的toString()方法显示的字符串就是按照ISO 8601格式显示的
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ISO_DATE.format(ldt));//2020-12-15
        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(ldt));//2020-12-15T14:10:14.751

    }
}
