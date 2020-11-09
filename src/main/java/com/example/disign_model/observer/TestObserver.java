package com.example.disign_model.observer;

/**
 * @ClassName
 * @Description
 * 概念：定义对象间得一种一对多得依赖关系，当一个对象得状态发生改变时，所有依赖于它得对象都得到通知自动更新。
 * 优点：  观察者和被观察者是抽象耦合得；
 *         建立了一套触发机制；
 * 缺点：  如果一个被观察者对象有很多得直接和间接得观察者得话，将所有得观察者都通知到会花费很多时间
 *         如果观察者和观察目标间有循环依赖，可能导致系统崩溃
 *         没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的
 * 应用场景： 天气预报、拍卖会、消息队列
 * @Autor wcy
 * @Date 2020/11/9 10:24
 */
public class TestObserver {
    public static void main(String[] args) {
        Woman woman = new Woman();
        woman.addPerson(new Man1());
        woman.addPerson(new Man2());
        woman.notifyPerson();
    }
}