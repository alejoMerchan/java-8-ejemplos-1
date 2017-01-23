package com.java.eight.in.action.functional.interfaces.predicate;

import com.java.eight.in.action.FilteringApples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abelmeos on 2017/01/23.
 */
public class MainPredicate {

    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("abc");
        listString.add("def");
        listString.add("");

        Predicate<String> nonEmptiStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(listString,nonEmptiStringPredicate);
        System.out.println(nonEmpty.size());



    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p){

        List<T> results = new ArrayList<>();
        for (T s:list){
            if(p.test(s)){

                results.add(s);
            }
        }

        return results;

    }
}
