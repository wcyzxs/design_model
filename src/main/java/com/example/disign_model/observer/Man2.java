package com.example.disign_model.observer;

/**
 * @ClassName
 * @Description
 * @Autor wcy
 * @Date 2020/11/9 10:17
 */
public class Man2 implements Person {
    @Override
    public void getMessage(String message) {
        System.out.println("Man2收到了内容："+message);
    }
}