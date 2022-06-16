package com.pattern.abstractfactory.factory;

import com.pattern.abstractfactory.AbstactFactory;
import com.pattern.abstractfactory.color.Color;
import com.pattern.abstractfactory.shape.Shape;

public class ColorFactory extends AbstactFactory {
    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
