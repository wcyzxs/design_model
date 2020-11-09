package com.example.disign_model.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName
 * @Description
 * @Autor wcy
 * @Date 2020/11/9 15:30
 */
public class MyInvocationHandler  implements InvocationHandler {
        private TargetInterface target;

        public Object getInstance(TargetInterface target) {
            this.target = target;
            Class<? extends TargetInterface> clazz = target.getClass();
            System.out.println("clazz:"+clazz);
            return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("将要执行方法名为" + method.getName() + "的方法");
            Object result = method.invoke(target, args);
            System.out.println("已经执行完方法名为" + method.getName() + "的方法");
            System.out.println(method.getName()+"方法的返回值result="+result);
            return result;
        }
    }
