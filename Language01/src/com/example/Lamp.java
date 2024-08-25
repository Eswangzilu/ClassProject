package com.example;

/**
 * 阿拉丁神灯
 *
 * 模版
 */
public class Lamp {

    /**
     * 属性 / 成员 / 变量
     * 成员变量
     *
     * 这些内容用于描述对象的形态
     *
     * private 修饰的变量，可以在本类中访问
     */
    private String name;
    private String outerMeterial;
    private String innerMeterial;
    private Double opacity;

    /**
     * C语言中常量指的是，生命周期贯穿程序始终、并且值不变的量
     *
     * static表示在类出现的时候就完成了构建，生命可以看作为贯穿程序始终
     * final表示此值不可修改
     *
     * 常量肯定是静态量，常量必须有初始值
     */
    private static String texture = "无花纹";
    private static final Double PI = 3.14;

    /**
     * 静态方法
     */
    public static void setTexture(String texture_) {
        texture = texture_;
    }

    /**
     * 方法 / 动作
     * 成员方法
     *
     * 动态
     *
     * 这些方法描述对象拥有的动作
     */
    public final void callUp() {
        System.out.println(name + "灯神出来!!");
    }
    public final void shineUp() {
        System.out.println(name + "灯发光!!");
    }
    public void info() {
        System.out.println("灯的名字是： " + this.name +
                            "\t外壳材质：" + this.outerMeterial +
                            "\t内部材质：" + this.innerMeterial +
                            "\t照度：" + this.opacity + "流明" +
                            "\t花纹：" + texture);
    }

    /**
     * SET / GET 是用来与private标记的变量(成员变量)进行交互的
     *
     */
    public void setName(String name) {
        this.name = name;
    }
    public void setOuterMeterial(String outerMeterial) {
        this.outerMeterial = outerMeterial;
    }
    public void setInnerMeterial(String innerMeterial) {
        this.innerMeterial = innerMeterial;
    }
    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public String getName() {
        return name;
    }

    public String getOuterMeterial() {
        return outerMeterial;
    }

    public String getInnerMeterial() {
        return innerMeterial;
    }

    public Double getOpacity() {
        return opacity;
    }
}
