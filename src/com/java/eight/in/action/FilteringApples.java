package com.java.eight.in.action;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by abelmeos on 2016/10/12.
 */
public class FilteringApples {

    /**
     * Metodo sgenericos para el filtrado de manzanas segun  el color o el peso.
     * @param inventory
     * @return
     */

    public List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if(apple.getWeight() > 150){
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * Se hace un refactor del codigo replicado de los dos metodos
     * permitiendo que la condicion se pase como parametro.
     *
     * @param apple
     * @return
     */

    public boolean isGreenApple (Apple apple){
        return "green".equals(apple.getColor());
    }

    public boolean isHeavyApple (Apple apple){
        return apple.getWeight() > 150;
    }

    public interface Predicate<T>{
        boolean test(T t);
    }

    public List<Apple> filterApples(List<Apple> inventory,Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public void prueba(){
        List<Apple> inventory = new ArrayList<>();
        Apple apple1 = new Apple(50,"green");
        Apple apple2 = new Apple(100,"red");

        //filterApples(inventory, Apple::is)
    }

}
