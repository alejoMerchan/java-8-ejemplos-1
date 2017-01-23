package com.java.eight.in.action;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.comparing;

/**
 * Created by abelmeos on 2016/11/08.
 */
public class AppleComparator implements Comparator<Apple> {
    public int compare(Apple a1, Apple a2){
        return a1.getWeight().compareTo(a2.getWeight());
    }
}

class OtherComparator{



    public void  compare(){

        List<Apple> inventory = new ArrayList<>();
        Apple apple1 = new Apple(50,"green");
        Apple apple2 = new Apple(100,"red");
        inventory.add(apple1);
        inventory.add(apple2);

        // comparacion utilizando clase anonima.
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        // comparacion utilizando expresiones lambda.
        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        // comparacion utilizando expresiones lambda e inferencia de tipos.
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));



    }



}
