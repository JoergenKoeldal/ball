package com.company;

public class TennisBall extends Ball {

    public TennisBall(String name, int size) {
        super(name, size);
    }
    @Override
    public Boolean isTennisBall() {
        return true;
    }
}
