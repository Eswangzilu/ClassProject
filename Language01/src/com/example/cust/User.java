package com.example.cust;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1. 类被程序引用到了，可以是new，也可以是静态调用
 *
 * 2. 分成两个部分，第一部分是把所有静态属性放到静态区域中，第二部分是初始化对象(*)
 *
 * 3. 分配堆上空间，用于存储new产生的对象(选好空间，划出来区域)
 *
 * 4. 写零，占有该区域(犁地)
 *
 * 5. 调用构造器，把要存储的数据，放到写好零的区域(默认的构造器，就是在这一步把你的值设置为了null)
 *
 * 6. new XXX()这句话就执行好了，会把这块区域(弄好的地)的地址，放到等号前面的变量中，接收到地址的变量就成为了对象
 */
public class User {

    /**
     * 如果没有用户自定义构造器，那么构造器将会使用系统默认的构造器，系统默认的构造器长如下样子
     */
//    public User() {
//        this.userName = null;
//        this.userPwd = null;
//        this.userCreate = null;
//    }

    public User(String userName, String userPwd, Date userCreate) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userCreate = userCreate;
    }
    public User(String userName, String userPwd, String defineDate) {
        this.userName = userName;
        this.userPwd = userPwd;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
//            Date date = format.parse("2002-12-19");
            this.userCreate = format.parse(defineDate);
        } catch (ParseException pe) {
            System.out.println("您传来的日期不太对，所以我用今天的日期替代了");
            this.userCreate = new Date();
        }
    }

    /* 用户自身携带的属性，私有 */
    private String userName;
    private String userPwd;
    private Date userCreate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(Date userCreate) {
        this.userCreate = userCreate;
    }
}
