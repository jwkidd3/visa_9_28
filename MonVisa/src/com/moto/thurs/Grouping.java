package com.moto.thurs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingByConcurrent;
import static java.util.stream.Collectors.partitioningBy;

public class Grouping {

    static class Dragon{
        String name;
        Dragon(String name){this.name=name;}
        public String getName(){return name;}
        public String toString() {return name;}
        public boolean isGreen(){return Math.random() > .5;}
    }
    public static List<Dragon> getDragons(){
        return Arrays.asList(new Dragon("Smaug"),new Dragon("Norbert"),new Dragon("Smoochy"),
                new Dragon("Nuvi"));
    }

    public static void main(String... args){
        List<Dragon> dragons=getDragons();
        Map<Character,List<Dragon>> map= dragons.parallelStream().
                collect(groupingByConcurrent(dragon -> dragon.getName().charAt(0)));
        System.out.println(map);

        Map<Boolean, List<Dragon>> map2 = dragons.stream().collect(partitioningBy(Dragon::isGreen));
        System.out.println(map2);
    }
}
