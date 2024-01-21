package com.SOLID.openclose;

public class Triangle implements Shape{
    public int base;
    public int height;

    @Override
    public int calculateArea(){
        return  base*height /2;
    }

}
