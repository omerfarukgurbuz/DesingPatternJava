
package com.factory;


public class ShapeFactory extends AbstractFactory{

    @Override
    IColor getColor(String color) {
        return null;
    }

    @Override
    IShape getShape(String shape) {
        
        if(shape == null)
            return null;
        
        if(shape.equals("circle"))
            return new Circle();
        
        if(shape.equals("rectengular"))
            return new Rectangular();
        
        if(shape.equals("square"))
            return new Square();
        
        else
            return null;
    }
    
    
    
}
