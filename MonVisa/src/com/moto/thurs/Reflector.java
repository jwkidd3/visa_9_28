package com.moto.thurs;

import java.lang.reflect.Method;

public class Reflector {
    public static void main(String...  args){
        try {
            Class clazz=Class.forName("com.moto.thurs.Bubba");
            Object obj=clazz.newInstance();

            Method[] methods=clazz.getMethods();
            for (Method m: methods) {
                System.out.println(m.getName());
                //System.out.println(m.);
               if(m.getAnnotation(MyAnnotation.class) !=null)
                    m.invoke(obj,(Object[])null);
            }

        } catch (Exception e) { e.printStackTrace();}

    }
}
