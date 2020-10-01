package com.moto.thurs;

public class BasicThreading {
    public static void main(String... args){
        SimpleThread st=new SimpleThread();
        st.start();
    }
}
class SimpleThread extends Thread{
    private long starttime,runtime;
    public SimpleThread(){
        super();
    }

    public void start(){
        starttime=System.nanoTime();
        super.start();
    }

    public void run(){
        runtime=System.nanoTime();
       // System.out.println("Running: " +(runtime-starttime));
        System.out.printf("Elapsed time: %d nano \n",(runtime-starttime));
        }
}
