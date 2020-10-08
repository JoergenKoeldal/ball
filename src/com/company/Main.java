package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static ArrayList<Ball> getBalls() {

        ArrayList<Ball> balls = new ArrayList<>();

        Football fb = new Football("Addidas", 3);
        balls.add(new Football("Select", 5));
        balls.add(new Football("Hummel", 3));
        balls.add(fb);


        TennisBall tb = new TennisBall("Treton", 2);
        balls.add(tb);
        balls.add(new TennisBall("Wilson", 1));
        balls.add(new TennisBall("Phillip", 3));


//        System.out.println("Antal bolde = " + balls.size());
//        System.out.println(balls);

        //Finder en bold med samme navn og size, gennem equals metoden i Ball klassen
        Football fbFind = new Football("Addidas", 3);
        //indexOf returnere indexpladsen på det første element på listen der passer
        int i = balls.indexOf(fbFind);
        System.out.println("fundet = " + i);

        return balls;
    }

    public static ArrayList<Integer> getIntegers() {

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        System.out.println(ints);
        Integer min = Collections.min(ints);
        int hs = min.hashCode();
        System.out.println("hashcode for 10, " + hs);
        System.out.println("min = " + min);
        return ints;
    }

    public static void main(String[] args) {
        ArrayList<Ball> balls = getBalls();
//        System.out.println(balls.size());
//         Ball mindsteBold = Collections.min(balls);

        Ball mindsteball = Collections.min(balls);
      //  System.out.println(mindsteball);
        Collections.sort(balls);
        System.out.println(balls);

        for (int i = balls.size()-1; i >= 0; i--) {
            Ball b = balls.get(i);
            if (b.isTennisBall()) {
                balls.remove(b);
            }
        }
        System.out.println("TEASTATD" + balls);



        //Denne kodedel looper gennem alle Ball objekterne og tilføjer tennisboldene til et arraylist

        ArrayList<TennisBall> tbList = new ArrayList<>();

        for (Ball b : balls) {
            if (b instanceof TennisBall) {
                tbList.add((TennisBall) b);
            }
        }

       // System.out.println(tbList);

    }
}
