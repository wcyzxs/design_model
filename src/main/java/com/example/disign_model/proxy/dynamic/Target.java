package com.example.disign_model.proxy.dynamic;

/**
 * @ClassName
 * @Description
 * @Autor wcy
 * @Date 2020/11/9 15:10
 */
public class Target implements TargetInterface {
    @Override
    public void print() {
        System.out.println("我是目标对象的print方法");
    }
}