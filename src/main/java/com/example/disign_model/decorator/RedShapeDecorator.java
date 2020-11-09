package com.example.disign_model.decorator;

/**
 * @ClassName
 * @Description     具体装饰类
 * @Autor wcy
 * @Date 2020/11/9 13:54
 */
public class RedShapeDecorator extends  ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        add(shapeDecorator);
    }

    public void add(Shape shape){
        System.out.println("这是在装饰具体组件"+shape);
    }
}