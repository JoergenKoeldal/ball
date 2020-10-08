package com.company;

public class Football extends Ball {


    public Football(String name, int size) {
        super(name, size);
    }
    @Override
    public Boolean isTennisBall() {
        return false;
    }


//    @Override
//    public String extraInfo() {
//        return " Jeg er en bold";
//    }


}
