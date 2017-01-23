package com.java.eight.in.action;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * Created by abelmeos on 2016/10/12.
 */
public class MainEjemplos {

    public static void main(String args[]){

        List<Apple> inventory = new ArrayList<>();
        Apple apple1 = new Apple(50,"green");
        Apple apple2 = new Apple(100,"red");

        FilteringApples filter = new FilteringApples();


        // Constructor references.

        BiFunction<Integer,String,Apple>  c1 = Apple::new;

        Apple c3 = c1.apply(110,"green");









    }


}
