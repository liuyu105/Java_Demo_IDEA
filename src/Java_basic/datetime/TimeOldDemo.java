package Java_basic.datetime;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeOldDemo {
    public static void main(String[] args) {
        int n = 123400;
        //以十六进制输出1e208
        System.out.println(Integer.toHexString(n));
        //以美国标准输出$123,400.00
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(n));

        //在Java程序中，时间戳通常是用long表示的毫秒数
        long t = 1574208900123L;
        //获取当前时间戳
        System.out.println(System.currentTimeMillis());

        //Date的用法
        //获取当前时间
        Date date = new Date();
        System.out.println(date.getYear() + 1900);// 必须加上1900
        System.out.println(date.getMonth() + 1); // 0~11，必须加上1
        System.out.println(date.getDate()); // 1~31，不能加1
        //转换为String
        System.out.println(date.toString());
        //转换为GMT时区
        System.out.println(date.toGMTString());
        //转换为本地时区
        System.out.println(date.toLocaleString());
        //自定义时间格式输出
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date)); //2020-12-15 08:49:39
        System.out.println(new SimpleDateFormat("E MMM,yyyy").format(date)); //星期二 十二月,2020

        //Calendar的用法
        //获取当前时间
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH) + 1;
        int d = c.get(Calendar.DAY_OF_MONTH);
        //星期几，1~7分别表示周日，周一，……，周六。
        int w = c.get(Calendar.DAY_OF_WEEK);
        int hh = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);
        int ms = c.get(Calendar.MILLISECOND);
        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);

        //清除所有
        c.clear();
        //设置2021年
        c.set(Calendar.YEAR, 2021);
        // 设置9月:注意8表示9月:
        c.set(Calendar.MONTH, 8);
        // 设置2日:
        c.set(Calendar.DATE, 2);
        // 设置时间:
        c.set(Calendar.HOUR_OF_DAY, 21);
        c.set(Calendar.MINUTE, 22);
        c.set(Calendar.SECOND, 23);
        //2021-09-02 21:22:23
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));

        //TimeZone的用法
        TimeZone tzDefault = TimeZone.getDefault(); //当前时区
        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00");//GMT+9:00时区
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York"); // 纽约时区
        System.out.println(tzDefault.getID()); // GMT+08:00
        System.out.println(tzGMT9.getID()); // GMT+09:00
        System.out.println(tzNY.getID()); // America/New_York
        //列出系统支持的所有时区ID
        for
        (String str : TimeZone.getAvailableIDs()) {
            System.out.println(str);
        }

        //将北京时间2019-11-20 8:15:00转换为纽约时间：
        // 清除所有:
        c.clear();
        // 设置为北京时区:
        c.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        // 设置年月日时分秒:
        c.set(2019, 10, 20, 8, 15, 0);
        // 显示时间:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        // 2019-11-19 19:15:00
        System.out.println(sdf.format(c.getTime()));


    }
}
