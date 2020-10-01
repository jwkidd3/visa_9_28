package com.moto.io;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheLeaker {
    static class Key extends Object{
        Integer id;
        Byte[] b;

        Key(Integer id){
            this.id=id;
            b=new Byte[100];
        }
/*
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(id, key.id);
        }
*/
        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static void main(String... args){
        Map<Key,String> m=new HashMap<>();

        while(true){
            int i =0;
            for(; i<10000;i++){
                m.put(new Key(i), "Number: "+i);
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println(m.size());
        }
    }
}
