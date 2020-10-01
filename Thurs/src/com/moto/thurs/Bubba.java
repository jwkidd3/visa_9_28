package com.moto.thurs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Bubba {
    List<Integer> numlist=new ArrayList();
    List<String> list;
    public Bubba(){
        for (int i=0; i<1000; i++)
            numlist.add(i);
         list = Arrays.asList("fooo", "bar", "yo", "zulu bravo");
    }
    private void processData(int num)
    {
        try{
            Thread.sleep(20);
            //System.out.println("Processing: "+ num);
        }catch(Exception e){}
    }
    public void print1to10(){
        IntStream.range(1,11).forEach(System.out::println);
    }
    public void sortStrings(){
        Collections.sort(list,(s1, s2) -> s2.length() -  s1.length());
    }
    public void printList(){
        list.forEach(System.out::println);
    }

    public void streamProcess(){
        long startTime=System.currentTimeMillis();
        numlist.stream().forEach((i -> processData(i)));
        long endTime=System.currentTimeMillis();
        System.out.println("Non Parallel time: "+(endTime-startTime));

        startTime=System.currentTimeMillis();
        numlist.parallelStream().forEach((i -> processData(i)));
         endTime=System.currentTimeMillis();
        System.out.println("Parallel time: "+(endTime-startTime));
    }

    public static void main(String... args){

        Bubba b=new Bubba();
       /* b.print1to10();
        b.printList();
        b.sortStrings();
        b.printList(); */

        b.streamProcess();


    }
}
