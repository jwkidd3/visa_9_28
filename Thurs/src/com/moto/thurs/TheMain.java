package com.moto.thurs;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.Arrays;
import java.util.List;

public class TheMain {

    public static void main(String... args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        int sum=0;
        for (Integer n: list){
            int x=n*n;
            sum=sum+x;
        }
        System.out.println(sum);

        int sum1=list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum1);

    }
}
