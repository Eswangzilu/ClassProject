package com.example;


import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Class02 {

    /**
     * 静态方法无法直接访问非静态方法
     * 非静态方法可以访问静态方法
     */
    public static void main(String[] args) {
//        test();
//        financial();
//        var number = 3; // int
//        financial(15000.0, 0.8);
//        greatday("02-12-19@20:23:07", "yyyy-MM-dd'@'dd");
            greatday();
//        calendar();
        // select to_date('05-01-95 08:27:27', 'dd-MM-RR HH24:MI:SS') from dual;


//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        c1.set(2002,06,06);
//        c2.set(2002,12,19);
//
//        calendar(c1, c2);

//        dynamicString();
    }

    public static void test() {
        // 过长的数字(超过17位)失去精度
        Double numb1 = Double.valueOf(0.11111111111111112222222222222);
        Double numb2 = Double.valueOf("0.11111111111111112222222222222");
        System.out.println(numb1);
        System.out.println(numb2);
    }

    public static void financial() {
        // BigDecimal 也是一个用于存储浮点数的类型， 但是它格外的大
        // 推荐使用接受string参数的构造器，因为能够保证数据的精确
//        BigDecimal bnum1 = new BigDecimal(0.1);   这个方法不太妙，精度问题


        // 1.原始数据
        BigDecimal bnum2 = new BigDecimal("155.23");

        // 2.创建壳子
        NumberFormat shell1 = NumberFormat.getCurrencyInstance(Locale.KOREA);
        NumberFormat shell2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // 3.把壳子套在原始数据上
        String result1 = shell1.format(bnum2);
        String result2 = shell2.format(bnum2);

        System.out.println(result1);
        System.out.println(result2);

//        Locale[] countries = NumberFormat.getAvailableLocales();
//        for (Locale country : countries) {
//            System.out.println(country);
//        }

    }

    public static void financial(Double currency, Double profit) {

        // 需要还的钱 = 贷款的钱 x 利率(0.8%)
        BigDecimal cur = new BigDecimal(String.valueOf(currency));
        BigDecimal per = new BigDecimal(profit.toString());
        BigDecimal drawback = cur.multiply(per);

        // 如果不套壳子，将会得到如下的输出，不方便会计阅读
        System.out.println("未套壳子的货币: " + cur);
        System.out.println("未套壳子的利率: " + per);
        System.out.println("未套壳子的还款: " + drawback);

        // 这些是要套壳子的，你想要套壳子，得先创建它
        NumberFormat formatCur = NumberFormat.getCurrencyInstance();    // $xx,xxx,xxx
        NumberFormat formatPer = NumberFormat.getPercentInstance();     // xxx.xx%

        String resultCurrency = formatCur.format(cur);          // $xx,xxx,xxx
        String resultDrawback = formatCur.format(drawback);     // $xx,xxx,xxx
        String resultPercent = formatPer.format(per);           // xxx.xx%
        System.out.println("套壳子的货币: " + resultCurrency);
        System.out.println("套壳子的利率: " + resultPercent);
        System.out.println("套壳子的还款: " + resultDrawback);
    }

    public static void greatday() {
        Date now = new Date();
        Long time = now.getTime();  // 自1970-01-01以来的经过的毫秒

        System.out.println(now);
        System.out.println(time);
    }

    public static void greatday(String time, String syntax) {
        /**
         * 2024-08-19 20:58:31
         * 如何格式化时间？
         * 通过 SimpleDateFormat类，提供日期通式给构造器 给日期套壳子用的
         * 类似于 NumberFormat类 给数字套壳子用
         */
        SimpleDateFormat shell = null;
        try {
            shell = new SimpleDateFormat(syntax);
            Date date = shell.parse(time);
            Date mid = shell.parse("2002-06-06@01:46:06");

            System.out.println(date);
            System.out.println(mid);
        } catch (ParseException pe) {
            System.err.println("YOU ARE WRONG: " + pe);
        } catch (IllegalArgumentException ae) {
            System.err.println("Format syntax ERROR: " + ae);
        }
    }

    public static void calendar(Calendar age1, Calendar age2) {
        Long ms1 = age1.getTime().getTime();
        Long ms2 = age2.getTime().getTime();

        Long diff = Math.abs(ms1 - ms2);
//        Date result = new Date(diff);

        Long daysDiff = diff / 1000 / 60 / 60 / 24;

        System.out.println(daysDiff);

    }

    public static void dynamicString() {
        String username = "TEST";

        /**
         * StringBuffer与StringBuilder功能是一样的，只是前者提供线程安全
         */
        StringBuffer str1 = new StringBuffer("HELLO, LLX !!");
        str1.replace(12, 13, "?");
        str1.insert(11, "love WZL ");
        str1.delete(str1.length() - 1, str1.length());
        str1.delete(5, 6);
        str1.reverse();
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer(6);
        str2.append("HELLO!!");

        /**
         * 在StringBuffer中，如果你的length超越了capacity，这种就是溢出，此时capacity会自动扩展
         * 新capacity = 旧capacity * 2 + 2
         *
         * 性能高
         */
        System.out.println(str2.capacity());
        System.out.println(str2.length());
    }
}
