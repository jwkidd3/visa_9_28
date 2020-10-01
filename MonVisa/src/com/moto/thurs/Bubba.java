package com.moto.thurs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Bubba {
    List<Integer> numList=new ArrayList();
    List<String> list;
    public Bubba(){
        for(int i=0;i<1000;i++){
            numList.add(i);
        }
        list= Arrays.asList("foo","bar","yo","visa","zulu bravo");
    }
    public void print1to10(){
        IntStream.range(1,11).forEach(System.out::println);
    }
    public void sortStrings(){
        Collections.sort(list,(s1,s2) -> s2.length() - s1.length());
    }
    public void printList(){
        list.forEach(System.out::println);
    }

    private void processData(Integer num) {
        System.out.println("Process data...");
        try {
            Thread.sleep(20);
            System.out.println("Processing: " + num);
        } catch (InterruptedException e) { //wdc }
        }
    }
    @MyAnnotation(name="dothis")
    public void streamProcess(){
        long start=System.currentTimeMillis();
        numList.stream().forEach(i -> processData(i));
        long end=System.currentTimeMillis();
        System.out.println("Non Parallel Processing: "+ (end-start));

        start=System.currentTimeMillis();
        numList.parallelStream().forEach(i -> processData(i));
        end=System.currentTimeMillis();
        System.out.println("Parallel Processing: "+ (end-start));
    }

    public static void main(String... args)
    {
        Bubba b=new Bubba();
        b.print1to10();
        b.sortStrings();
        b.printList();
        b.streamProcess();
    }
}
