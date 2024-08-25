package com.example;

/**
 * 普通的类
 * 抽象类
 * 内部类
 * 静态类
 * 接口
 * 枚举类
 * 注解类
 */


public class Class03 {
    public static void main(String[] args) {
        /**
         * 静态调用独立于对象数据，静态区域只初始化一次
         */
        Lamp.setTexture("无花纹");

        // 创建油灯
        OiledLamp oiledLamp = new OiledLamp();
        // 创建电灯
        Lamp electricLamp = new ElectricLamp();


        /**
         * 对于油灯而言，外壳材质应该是金属、内部材质应该是煤油、名字叫油灯、照度0.25流明
         */
        oiledLamp.setName("油灯");
        oiledLamp.setOuterMeterial("黄铜");
        oiledLamp.setInnerMeterial("煤油");
        oiledLamp.setOpacity(0.25);
        oiledLamp.setCapicity(500.0);
        oiledLamp.callUp();
        oiledLamp.shineUp();
        oiledLamp.info();

        /**
         * 对于电灯而言，外壳材质应该是玻璃陶瓷、内部材质应该是钨丝、名字叫电灯泡子、照度3.14流明
         */
        electricLamp.setName("电灯");
        electricLamp.setOuterMeterial("玻璃陶瓷");
        electricLamp.setInnerMeterial("钨丝");
        electricLamp.setOpacity(3.14);
        electricLamp.callUp();
        electricLamp.shineUp();
        electricLamp.info();
    }
}
