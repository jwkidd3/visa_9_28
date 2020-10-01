package com.moto.thurs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Func {
    public static void main(String... args){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);

        eval(list,(q)->true);
        eval(list,(t)->false);
        eval(list,(n)->n%2==0);
        eval(list,(n)->n%2==1);
        eval(list,(n)->n > 5);
    }
    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        for(Integer n:list){
            if(predicate.test(n)){
                System.out.println(n + " ");
            }
        }
    }
}
