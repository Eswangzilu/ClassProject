package com.example.rodent;

/**
 * 基本功能和抽象类一样，接口是一种非常特殊的抽象类
 *
 * 特殊在哪里？接口中声明的所有方法，必须都被实现，不可选
 */
public interface RodentHabitat {
    public void dig();
    public void store();
}
