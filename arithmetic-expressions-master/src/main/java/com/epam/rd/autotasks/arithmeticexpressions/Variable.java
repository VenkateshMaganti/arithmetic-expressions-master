package com.epam.rd.autotasks.arithmeticexpressions;

public class Variable implements Expression {

    public String name;
    public int value;

    public Variable(String name, int value) {
        //implement this method
        this.value = value;
        this.name = name;
    }

    public void setValue(int value) {
        //implement this method
        this.value=value;
    }

    @Override
    public int evaluate() {
        //implement this method
        //return 0;
        return value;
    }

    @Override
    public String toExpressionString() {
        //implement this method
        //return null;
        return name;
    }
}
