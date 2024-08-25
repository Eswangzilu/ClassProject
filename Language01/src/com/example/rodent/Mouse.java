package com.example.rodent;

public class Mouse extends Rodent implements RodentHabitat {
    @Override
    public void eat() {
        this.foodType = "腐肉";
        System.out.println("老鼠吃饭，吃：" + foodType);
    }

    @Override
    public void bite() {
        System.out.println("老鼠咬人");
    }

    @Override
    public void sleep() {
        System.out.println("老鼠睡觉");
    }

    @Override
    public void dig() {
        System.out.println("老鼠会挖洞");
    }

    @Override
    public void store() {
        System.out.println("老鼠会在洞穴中贮藏东西");
    }
}
