package com.company;

import com.pattern.factory.Shape;
import com.pattern.factory.ShapeFactory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(("CIRCLE"));

        shape.draw();
    }
}
