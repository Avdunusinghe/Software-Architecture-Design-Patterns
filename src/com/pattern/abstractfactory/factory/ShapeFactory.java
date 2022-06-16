package com.pattern.abstractfactory.factory;
import com.pattern.abstractfactory.AbstactFactory;
import com.pattern.abstractfactory.color.Color;
import com.pattern.abstractfactory.shape.Circle;
import com.pattern.abstractfactory.shape.Rectangle;
import com.pattern.abstractfactory.shape.Shape;
import com.pattern.abstractfactory.shape.Square;

public class ShapeFactory extends AbstactFactory {

    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Shape getShape(String type) {
        if(type == null){
            return null;
        }
        else if(type.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(type.equalsIgnoreCase(("RECTANGLE"))){
            return new Rectangle();
        }
        else if(type.equalsIgnoreCase(("SQUARE"))){
            return new Square();
        }

        return null;
    }
}
