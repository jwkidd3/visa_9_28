package com.moto.io;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       List<Integer> al=new ArrayList<>();
       final int counter=100000;
       int res=0;


        System.out.println("----ADDS-----");
       long startTime=System.currentTimeMillis();
       for(int i=0; i < counter; i++)
           al.add(i);
       long endTime=System.currentTimeMillis();

       Iterator it=al.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
        System.out.println(endTime-startTime);

        System.out.println("---GET----");
        startTime=System.currentTimeMillis();
        for(int i=0; i < counter; i++)
            al.get(i);
        endTime=System.currentTimeMillis();

        System.out.println(endTime-startTime);

        System.out.println("---REMOVE----");
        startTime=System.currentTimeMillis();
        for(int i=0; i < counter; i++)
            al.remove(0);
        endTime=System.currentTimeMillis();

        System.out.println(endTime-startTime);
    }
}
