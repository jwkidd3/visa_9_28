package com.moto.thurs;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Map m = new HashMap<>();
        while(true){
            int i=0;
            for(;i<10000;i++){
                m.put(new Key(i), "Number: " + i );
            }
            System.out.println("Entries: " + m.size());
        }

    }

    static class Key  extends Object{

        Integer id;
        Byte[] b;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return id.equals(key.id);
        }

        Key(Integer i){
            this.id=i;
            b=new Byte[100];
        }

        @Override
        public int hashCode(){
            return id.hashCode();
        }
    }

}
