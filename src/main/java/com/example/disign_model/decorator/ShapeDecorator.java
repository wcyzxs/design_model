package com.example.disign_model.decorator;

/**
 * @ClassName
 * @Description 装饰者抽象类      装饰组件对象的，内部一定要有一个指向组件对象的引用！！！ 通过该引用可以调用装饰前构建对象的方法，并通过其子类扩展该方法，已达到装饰的目的
 * @Autor wcy
 * @Date 2020/11/9 13:52
 */
public abstract class ShapeDecorator implements  Shape{

    protected Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}