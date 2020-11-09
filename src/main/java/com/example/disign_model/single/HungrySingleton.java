package com.example.disign_model.single;

/**
 * @ClassName
 * @Description  饿汉
 * 实例在初始化的时候就已经建好了，不管你有没有用到，都先建好了再说。好处是没有线程安全的问题，坏处是浪费内存空间。
 * @Autor wcy
 * @Date 2020/11/9 10:06
 */
public class HungrySingleton {
    private static  HungrySingleton hungrySingleton = new HungrySingleton();

    public HungrySingleton() {
    }

    private static  HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}