package com.example.disign_model.decorator;

/**
 * @ClassName
 * @Description 具体组件
 * @Autor wcy
 * @Date 2020/11/9 13:48
 */
public class Circle implements  Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}