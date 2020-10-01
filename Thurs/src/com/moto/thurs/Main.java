package com.moto.thurs;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyGeneric<List<Integer>, Integer> x=new MyGeneric();

        x.setMyVar(null);
        x.setNum(99);

        System.out.println(x.getMyVar() + " - " + x.getNum());

      }


}
