package com.moto.thurs;

import java.util.Collection;
import java.util.List;

public class MyGeneric {
    public static void main(String... args){
        GenericVO<List<Integer>, Integer> x= new GenericVO();

        x.setMyVar(null);
        x.setAnother(99);

        System.out.println(x.getMyVar() + " -  "+ x.getAnother());
    }
}
class GenericVO<A extends Collection<? extends Object>,B extends Number>{
    private A myVar;
    private B  another;

    public A getMyVar() {
        return myVar;
    }

    public void setMyVar(A myVar) {
        this.myVar = myVar;
    }

    public B getAnother() {
        return another;
    }

    public void setAnother(B another) {
        this.another = another;
    }
}
