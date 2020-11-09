package com.example.disign_model.proxy.staticProxy;

/**
 * @ClassName
 * @Description
 * @Autor wcy
 * @Date 2020/11/9 14:41
 */
public class RealSubject implements  Subject {
    @Override
    public void visit() {
        System.out.println("RealSubject....");
    }
}