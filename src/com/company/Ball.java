package com.company;

import java.util.Objects;

public abstract class Ball implements Comparable<Ball> {
    private String name;
    private int size;

    public Ball(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String extraInfo() {
        return this.getClass().getSimpleName();
    }

    public Boolean isTennisBall() {
        return false;
    }

    @Override
    public int compareTo(Ball o) {
        //compares if a football is bigger than a tennisball
        if(o.isTennisBall() && !this.isTennisBall()) {
            return 1;
        } else {
            //Sammenligner hvis man kommer med en tennisbold og sammenligner med en fodbold, så vil den være mindre
            if (this.isTennisBall() && !o.isTennisBall()) {
                return -1;
            } else {
                //Sammenligner størrelse
                Integer ii = this.getSize();
               return ii.compareTo(o.size);
            }

        }
        }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //caster objektet til en bold, fortæller compileren at objektet o er en bold.
        // Uden den linje vil jeg ikke kunne begynde at bruge metoderne fra ball
        Ball ball = (Ball) o;
        return size == ball.size &&
                Objects.equals(name, ball.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", size=" + size + this.extraInfo() +
                '}';
    }
}
