package com.example.rodent;

public class Hamster extends Rodent {
    @Override
    public void eat() {
        this.foodType = "任何物品";
        System.out.println("花枝鼠吃饭，吃：" + foodType);
    }

    @Override
    public void bite() {
        System.out.println("花枝鼠咬人");
    }

    @Override
    public void sleep() {
        System.out.println("花枝鼠睡觉");
    }

    public void store() {
        System.out.println("花枝鼠会用嘴贮藏东西");
    }
}
