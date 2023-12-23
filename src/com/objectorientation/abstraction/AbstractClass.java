package com.objectorientation.abstraction;

public abstract class AbstractClass {
    public int value;

    abstract int getVal();
}

class AbstractChildClass extends AbstractClass {

    @Override
    int getVal() {
        value = value + 1;
        System.out.println(value);
        return value;
    }
}
