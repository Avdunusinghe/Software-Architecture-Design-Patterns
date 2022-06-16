package com.pattern.abstractfactory;

import com.pattern.abstractfactory.color.Color;
import com.pattern.abstractfactory.shape.Shape;

public abstract class AbstactFactory {

    public abstract Color getColor(String type);
    public abstract Shape getShape(String type);
}
