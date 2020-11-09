package com.example.disign_model.decorator;

/**
 * @ClassName
 * @Description
 * 四个角色
 * Component： 抽象组件  可以是接口或抽象类，具体组件与抽象装饰类的共同父类，声明了具体组件中实现的业务方法，比如tea
 * ConcreteComponent：具体组件    实现抽象组件的业务方法，装饰器类可以给他增加额外的责任(方法)，比如milkTea
 * Decorator： 抽象装饰类     装饰组件对象的，内部一定要有一个指向组件对象的引用！！！ 通过该引用可以调用装饰前构建对象的方法，并通过其子类扩展该方法，已达到装饰的目的
 * ConcreteDecorator： 具体装饰类     抽象装饰类的具体实现，可以调用抽象装饰类中定义的方法，也可以新增新得方法来扩充对象的行为
 *
 * 要点：装饰者(shapedecorator)与被装饰者(circle,rrctangle)拥有共同的父类(shape),继承的目的是继承类型，而不是行为
 * 设计原则：对扩展开放，对修改关闭。这句话体现在我如果想扩展被装饰者类类的行为，无须修改装饰者抽象类，只需继承装饰者抽象类，实现额外的装饰行为即可对被装饰者进行包装扩展。
 *
 * 使用场景：1.扩展一个类的功能	2.动态增加功能，动态撤销。
 * @Autor wcy
 * @Date 2020/11/9 13:34
 */
public class TestDecorator {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("装饰前");
        circle.draw();

        RedShapeDecorator cricleShapeDecorator = new RedShapeDecorator(new Circle());
        RedShapeDecorator rrctangleShapeDecorator = new RedShapeDecorator(new Rrctangle());
        System.out.println("装饰后");
        cricleShapeDecorator.draw();

        rrctangleShapeDecorator.draw();
    }
}