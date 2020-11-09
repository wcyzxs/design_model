package com.example.disign_model.observer;

/**
 *定义抽象观察者接口（具体得抽象观察者需要实现该接口，在得到主题通知时更新自己）
 */
public interface Person {
    void getMessage(String message);
}
