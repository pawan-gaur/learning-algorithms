package com.pgaur.tutorial.executor;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "My Task is done";
            }
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callable);

        if (future.isDone()) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

        }
        executorService.shutdown();

    }

}
