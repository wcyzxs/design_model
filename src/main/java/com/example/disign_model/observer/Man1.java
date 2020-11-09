package com.example.disign_model.observer;

/**
 * @ClassName
 * @Description   定义观察者对象，实现观察者接口
 * @Autor wcy
 * @Date 2020/11/9 10:17
 */
public class Man1 implements Person {
    @Override
    public void getMessage(String message) {
        System.out.println("Man1收到了内容："+message);
    }
}