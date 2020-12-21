package Java_basic.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        //LocalDateTime的用法
        LocalDate d0 = LocalDate.now(); // 当前日期
        LocalTime t0 = LocalTime.now(); // 当前时间
        LocalDateTime dt0 = LocalDateTime.now(); // 当前日期和时间
        System.out.println(d0); // 严格按照ISO 8601格式打印
        System.out.println(t0); // 严格按照ISO 8601格式打印
        System.out.println(dt0); // 严格按照ISO 8601格式打印

        //保证获取到同一时刻的日期和时间
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        LocalDate d = dt.toLocalDate(); // 转换到当前日期
        LocalTime t = dt.toLocalTime(); // 转换到当前时间

        // 指定日期和时间:
        LocalDate d2 = LocalDate.of(2019, 11, 30); // 2019-11-30, 注意11=11月
        LocalTime t2 = LocalTime.of(15, 16, 17); // 15:16:17
        LocalDateTime dt2 = LocalDateTime.of(2019, 11, 30, 15, 16, 17);
        LocalDateTime dt3 = LocalDateTime.of(d2, t2);

        //转换为标准格式
        LocalDateTime dt4 = LocalDateTime.parse("2019-11-19T15:16:17");
        LocalDate d4 = LocalDate.parse("2019-11-19");
        LocalTime t4 = LocalTime.parse("15:16:17");

        //自定义输出格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));//2020/12/15 10:17:44
        //用自定义格式解析为标准格式
        LocalDateTime dt_2 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(dt_2); //2019-11-30T15:16:17

        //LocalDateTime提供了对日期和时间进行加减的非常简单的链式调用
        LocalDateTime dt5 = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        System.out.println(dt5); //2019-10-26T20:30:59
        // 加5天减3小时:
        LocalDateTime dt6 = dt5.plusDays(5).minusHours(3);
        System.out.println(dt6); //2019-10-31T17:30:59
        // 减一个月
        LocalDateTime dt7 = dt6.minusMonths(1);
        System.out.println(dt7); //2019-09-30T17:30:59
        //withXxx()方法调整日期，月份变为8:
        LocalDateTime dt8 = dt7.withMonth(8);
        System.out.println(dt8);

        //判断两个LocalDateTime的先后，可以使用isBefore()、isAfter()方法
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime target = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        System.out.println(now.isBefore(target));
        System.out.println(LocalDate.now().isBefore(LocalDate.of(2019, 11, 19)));
        System.out.println(LocalTime.now().isAfter(LocalTime.parse("08:15:00")));

        //Duration和Period
        LocalDateTime start = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        LocalDateTime end = LocalDateTime.of(2020, 1, 9, 19, 25, 30);
        Duration du = Duration.between(start, end);
        System.out.println(du); // PT1235H10M30S

        Period p = LocalDate.of(2019, 11, 19).until(LocalDate.of(2020, 1, 9));
        System.out.println(p); // P1M21D
    }
}
