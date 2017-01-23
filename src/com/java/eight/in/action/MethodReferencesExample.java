package com.java.eight.in.action;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abelmeos on 2016/11/04.
 */
public class MethodReferencesExample {

    public static void main(String args[]){

        List<String> str = Arrays.asList("a" , "b" , "A","B");
        str.sort((s1,s2) -> s1.compareToIgnoreCase(s2));

        // method reference
        str.sort(String::compareToIgnoreCase);


    }


}
