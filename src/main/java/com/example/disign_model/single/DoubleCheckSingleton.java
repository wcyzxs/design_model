package com.example.disign_model.single;

/**
 * @ClassName
 * @Description 懒汉-双重校验，解决线程安全问题
 * @Autor wcy
 * @Date 2020/11/9 10:09
 */
public class DoubleCheckSingleton {
    private  static DoubleCheckSingleton doubleCheckSingleton;

    public DoubleCheckSingleton() {

    }

    public  DoubleCheckSingleton getDoubleCheckSingleton(){
        if(doubleCheckSingleton == null){
            synchronized (doubleCheckSingleton){
                if(doubleCheckSingleton == null){
                    return  doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}