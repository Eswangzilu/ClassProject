package com.example;

import java.io.Serializable;

public class Class01 implements Serializable {
    public static void main(String[] args) {
        System.out.println("Hello, World !!");

        /**
         * 变量
         *  1. 原始类型 (整数类型、浮点类型[单/多]、布尔类型、字符类型)
         */
        int num1 = 2;
        short num2 = 2;
        long num3 = 2;

        float f1 = 3.14f;
        double f2 = 3.14;

        boolean b1 = true;
        boolean b2 = false;

        char c1 = 'a';      // 隐式类型转换

        /**
         * 再谈变量
         *  1. 包装类型 Wrapper (整型包装Integer 浮点包装Double/Float 布尔包装Boolean 字符串包装String 字符包装Character 长整型包装Long 精准数字包装Decimal 日期类型Date)
         *  2. 类类型 这个东西属于是有点DIY的意思
         *  3. 空类型
         *
         *  包装类型为我们提供了增强的变量操控能力
         */
        Integer num4 = 2;   // 字面量
        Long num5 = 2L;
        Long num6 = Long.valueOf("3216");
        Long num7 = Long.parseLong("3222");     // parseXxx
        Integer result = Long.compare(num6, num7);

        if (result > 0 ) {
            System.out.println("前面的数字大");
        } else if (result == 0) {
            System.out.println("一样大");
        } else {
            System.out.println("后面的数字大");
        }

        System.out.println(result);
        Double f3 = 3.14;
        Float f4 = 3.14f;

        Boolean b3 = true;

        String str1 = "Hello";
        String str2 = new String("Java");   // 构造器(多余的，没必要)，除字符串以外，其他包装类型的构造器都舍弃了
        String str3 = String.valueOf(333333333L);   // 把 Long 转换为 String
        char[] ca1 = {'H', 'E', 'L', 'L', 'O', ',' , 'J', 'A', 'V', 'A'};
        String str4 = String.copyValueOf(ca1);
        String str5 = String.copyValueOf(ca1, 6, 4);

        System.out.println(str4);
        System.out.println(str5);
    }
}
