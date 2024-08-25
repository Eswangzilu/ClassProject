package com.example.rodent;

/**
 *
 */
public class Gerbil extends Rodent implements RodentHabitat{
    @Override
    public void eat() {
        this.foodType = "任何物品";
        System.out.println("鼹鼠吃饭，吃：" + foodType);
    }

    @Override
    public void bite() {
        System.out.println("鼹鼠咬人");
    }

    @Override
    public void sleep() {
        System.out.println("鼹鼠睡觉");
    }

    @Override
    public void dig() {
        System.out.println("鼹鼠会挖洞");
    }

    @Override
    public void store() {
        System.out.println("鼹鼠会在洞穴中贮藏东西");
    }

    public void xxx() {
        System.out.println("任何鼹鼠动物都是会找地方居住的");
    }
}
