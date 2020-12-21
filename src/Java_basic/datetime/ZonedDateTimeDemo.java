package Java_basic.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
        System.out.println(zbj);
        System.out.println(zny);

        //时区转换
        //将北京时间转换为纽约时间
        // 以中国时区获取当前时间:
        ZonedDateTime zbj1 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        //转换为纽约时间：
        ZonedDateTime zny1=zbj1.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj1);
        System.out.println(zny1);

    }
}
