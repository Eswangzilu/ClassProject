package com.example;

public final class ElectricLamp extends Lamp {
    private Double velocity;

    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    public void info() {
        System.out.println("灯的名字是： " + getName() +
                "\t外壳材质：" + getOuterMeterial() +
                "\t内部材质：" + getInnerMeterial() +
                "\t照度：" + getOpacity() + "流明" +
                "\t电压：" + this.velocity + "伏特");

    }
}
