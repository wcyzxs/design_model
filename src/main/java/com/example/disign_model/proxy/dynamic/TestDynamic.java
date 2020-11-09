package com.example.disign_model.proxy.dynamic;

import sun.management.Agent;

/**
 * @ClassName
 * @Description
 * @Autor wcy
 * @Date 2020/11/9 15:31
 */
public class TestDynamic {
    public static void main(String[] args) {
        TargetInterface target = (TargetInterface) new MyInvocationHandler().getInstance(new Target());
        System.out.println("target:"+target.getClass());
        target.print();
    }
}