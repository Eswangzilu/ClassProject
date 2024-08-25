package com.example.rodent;


/**
 * abstract v. 抽象
 *
 * 抽象类描述的是一组规则，所有抽象类的后代要满足其中指定的规则
 * 什么样的规则必须被满足呢？ 带有 abstract 符号的一定需要被遵守
 *
 * 四个访问权限控制符 private public protected default(啥也不写)
 * 状态标识符 static final abstract default(啥也不写)
 *
 *
 * !!!!!! 永远无法创建接口和抽象类的对象 !!!!!!
 */
public abstract class Rodent {

    /* 包外无法访问 */
    protected String teeth = "大板牙";
    protected String foodType;

    /* 必须要被满足的，抽象方法的访问修饰符只能是 public / protected */
    public abstract void eat();
    public abstract void bite();
    public abstract void sleep();

    /* 可选的(可以默认被使用) */
    public void live() {
        System.out.println("任何啮齿类动物都是会找地方居住的");
    }
}