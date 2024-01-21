package com.SOLID.openclose;

public class Rectangle implements Shape{
    public int length;

    @Override
    public int calculateArea(){
        return length*length;
    }

}
