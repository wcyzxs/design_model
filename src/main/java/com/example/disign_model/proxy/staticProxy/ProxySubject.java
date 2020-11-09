package com.example.disign_model.proxy.staticProxy;

/**
 * @ClassName
 * @Description
 * @Autor wcy
 * @Date 2020/11/9 14:42
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}