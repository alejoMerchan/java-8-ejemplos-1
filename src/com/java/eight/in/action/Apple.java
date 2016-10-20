package com.java.eight.in.action;

/**
 * Created by abelmeos on 2016/10/12.
 */
public class Apple
{
    public Apple(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    private int weight = 0;
    private String color = "";



    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}


