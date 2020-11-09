package com.example.disign_model.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName
 * @Description
 * 定义被观察者对象，里面添加具体观察者，这个里面需要写通知方法（也可以事先定义一个被观察者对象接口，在接口里面定义方法，然后重写这个方法即可）
 * @Autor wcy
 * @Date 2020/11/9 10:19
 */
public class Woman {
    List<Person> list = new ArrayList<Person>();

    public  void addPerson(Person person){
        list.add(person);
    }

    //发生消息给观察者
    public void notifyPerson(){
        for(Person person : list){
            person.getMessage("今天我有空，一起出来吃个饭吧");
        }
    }
}