package com.moto.thurs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsX {

    public static void main(String... args){
        List<Integer> list=new LinkedList<>();
        final int counter=100000;
        int result=0;

        long start=System.currentTimeMillis();
        for(int i=0; i<counter;i++){
            list.add(i);
        }
        System.out.println("Adds: "+(System.currentTimeMillis()-start));

        start=System.currentTimeMillis();
        for(int i=0; i<counter;i++){
            result=list.get(i);
        }
        System.out.println("Gets: "+(System.currentTimeMillis()-start));

        start=System.currentTimeMillis();
        for(int i=0; i<counter;i++){
            list.remove(0);
        }
        System.out.println("Remove: "+(System.currentTimeMillis()-start));

    }
}
