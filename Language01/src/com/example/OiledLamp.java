package com.example;

public class OiledLamp extends Lamp {
    private Double capicity;

    public void setCapicity(Double capicity) {
        this.capicity = capicity;
    }

    /**
     * 重载
     */
    @Override
    public void info() {
        System.out.println("灯的名字是： " + getName() +
                "\t外壳材质：" + getOuterMeterial() +
                "\t内部材质：" + getInnerMeterial() +
                "\t照度：" + getOpacity() + "流明" +
                "\t容积：" + this.capicity + "毫升");

    }
}
