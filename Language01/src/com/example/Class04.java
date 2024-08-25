package com.example;

import com.example.cust.User;
import com.example.rodent.*;

import java.util.Date;

public class Class04 {
    public static void main(String[] args) {
//        Mouse mouse = new Mouse();
//        mouse.eat();
//        mouse.bite();
//        mouse.sleep();
//        mouse.live();
//
//        Hamster hamster = new Hamster();
//        hamster.eat();
//        hamster.bite();
//        hamster.sleep();
//        hamster.live();

        /* 窄化 / 向上转型 / 父类化 */
//        RodentHabitat gerbil1 =  new Gerbil();
//        Rodent gerbil2 = new Gerbil();

        /* 接口(interface)和抽象类(abstract class)均无法使用构造器创建对象，想拥有这些类型的对象时，应该通过向上转型法实现 */
//        Rodent rodent1 = new Rodent();
//        RodentHabitat rodent2 = new RodentHabitat();

        User u01 = new User("Scott", "tiger", "2002-12-19");
//        u01.setUserName("Scott");
//        u01.setUserPwd("tiger");
//        u01.setUserCreate(new Date());

        u01.setUserPwd("oracle_4U");

        System.out.println(u01.getUserName());
        System.out.println(u01.getUserPwd());
        System.out.println(u01.getUserCreate());
    }
}