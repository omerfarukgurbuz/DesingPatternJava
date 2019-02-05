
package com.factory;


public class ColorFactory extends AbstractFactory{

    @Override
    IShape getShape(String shape) {
        return null;
    }

    @Override
    IColor getColor(String color) {
        
        if(color == null)
            return null;
        
        if(color.equals("red"))
            return new Red();
        
        if(color.equals("green"))
            return new Green();
        
        if(color.equals("blue"))
            return new Blue();
        
        else
            return null;
    }
    
    
    
}
