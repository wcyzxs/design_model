package com.example.disign_model.single;

/**
 * @ClassName
 * @Description 懒汉
 * 用到的时候才去创建，用的时候才去检查有没有实例，如果有则返回，没有则新建。有线程安全和线程不安全两种写法，区别就是synchronized关键字。
 * (1)私有得静态实例对象
 * (2)私有得构造方法
 * (3)公有得获取该实例得方法
 * 应用场景：    spring中bean得创建
 * @Autor wcy
 * @Date 2020/11/9 10:01
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    public LazySingleton() {
    }

    public LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            return lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}