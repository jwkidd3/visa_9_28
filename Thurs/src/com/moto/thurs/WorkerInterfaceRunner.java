package com.moto.thurs;

import java.util.function.Function;

public class WorkerInterfaceRunner {
    public static void execute(WorkerInterface worker){
        worker.doSomeWork("Bubba1");
    }

    public static void main(String... args){

        execute(new WorkerInterface() {
            @Override
            public void doSomeWork(String x) {
                System.out.println("Anonymous Class exec-> " + x);
            }
        });

        WorkerInterface wi=(x) -> System.out.println("Invoiked via Lambda "+x);
        wi.doSomeWork("Bubba2");
        execute(wi);

        Function<String,String> atr=(name) -> {
            return "@" + name;
        };

        System.out.println(atr.apply("john"));
    }
}
