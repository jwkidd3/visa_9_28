package com.moto.io;

public class Main {

    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread("one");
        SimpleThread t2 = new SimpleThread("two");
        SimpleThread t3 = new SimpleThread("three");
        t1.start();
        t2.start();
        t3.start();
    }
}

class SimpleThread extends Thread {

    private long startTime;
    private long runTime;


    public SimpleThread() {
        super();
    }

    public SimpleThread(String s) {
        super(s);
    }

    @Override
    public synchronized void start() {
        startTime = System.nanoTime();
        super.start();
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {

                runTime = System.nanoTime();

                System.out.printf("SimpleThread[%s:%d:%d][%s].run(): run was called\n",
                        getName(), getId(), getPriority(), getThreadGroup().getName());
                System.out.printf("Elapsed time: %d nanoseconds\n", (runTime - startTime));
                startTime = System.nanoTime();
                try {
                    wait(11250);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted: " + getName());
                }
                notify();
            }
        }
    }
}
