package com.pattern.factory;

public class MainFactory {

    public static void MainFactory(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(("CIRCLE"));

        shape.draw();
    }
}
