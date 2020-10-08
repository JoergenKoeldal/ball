package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ball> balls = new ArrayList<>();
        Football fb = new Football("Addidas", 6);
        balls.add(fb);
        TennisBall tb = new TennisBall("Treton", 2);
        balls.add(tb);

        System.out.println(balls);

    }
}
