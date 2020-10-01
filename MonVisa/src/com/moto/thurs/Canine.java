package com.moto.thurs;

public interface Canine {
    default void bark(){
        System.out.println("Woof");
    }
}
