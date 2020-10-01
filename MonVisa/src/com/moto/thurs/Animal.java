package com.moto.thurs;

public interface Animal {
    @MyAnnotation(name="yo")
    default public void eat(){
        System.out.println("I am eating......");
    };
}
