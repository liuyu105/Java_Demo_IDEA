package Java_basic.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        Instant now=Instant.now();
        System.out.println(now.getEpochSecond()); //秒1608015033
        System.out.println(now.toEpochMilli());//毫秒 1608015033237

        //以指定时间戳创建Instant
        Instant ins=Instant.ofEpochSecond(1608015033);
        ZonedDateTime zdt=ins.atZone(ZoneId.systemDefault());
        System.out.println(zdt);//2020-12-15T14:49:56+08:00[GMT+08:00]

    }
}
