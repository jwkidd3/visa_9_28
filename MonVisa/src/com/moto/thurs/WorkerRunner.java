package com.moto.thurs;

import sun.tools.jconsole.Worker;

import java.util.function.Function;

public class WorkerRunner {
    public static void  execute(WorkerInterface worker){
        worker.doSomeWork("Bubba1");
    }

    public static void main(String... args){
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork(String x) {
                System.out.println("anon class exec->" + x);
            }
        });
        WorkerInterface wi=(x) -> System.out.println("Invoked Lambda: "+ x);
        wi.doSomeWork("Bubba2");
        execute(wi);

        Function<String, String> atr=(name) -> {
          return "@" + name;
        };
        System.out.println(atr.apply("Bubba"));
    }
}
