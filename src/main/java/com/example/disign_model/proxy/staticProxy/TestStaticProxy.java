package com.example.disign_model.proxy.staticProxy;

/**
 * @ClassName
 * @Description     静态代理在程序运行前，它的.class文件就存在了，程序员创建的代理类
 * 代理类必须接受一个Subject接口的对象，任何实现该接口的对象，都可以通过代理类进行代理，增加了通用性。
 * 但是也有缺点，每一个代理类，都必须实现一遍委托类（也就是RealSubject）的接口，如果接口增加方法，则代理类也要跟着改；
 * 其次，代理类每一个接口对象对应一个委托对象，如果委托对象非常多，则静态代理就非常臃肿，难以胜任。
 * @Autor wcy
 * @Date 2020/11/9 14:43
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        realSubject.visit();

        System.out.println("使用静态代理访问RealSubject");
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();
    }
}