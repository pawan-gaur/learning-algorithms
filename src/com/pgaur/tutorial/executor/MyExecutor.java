package com.pgaur.tutorial.executor;

import java.util.concurrent.*;

public class MyExecutor {

    public static void main(String[] args) {
        My[] my = {
                new My("pawan"),
                new My("prabhakar"),
                new My("amit"),
                new My("umesh"),
                new My("ram"),
                new My("mohit"),
                new My("shyam")
        };
        //ExecutorService ex = Executors.newFixedThreadPool(6);

        ThreadPoolExecutor ex = new ThreadPoolExecutor(7,7,
                1000,TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        for(My m1 : my){
            ex.submit(m1);
        }
        //ex.shutdown();
    }
}

class My implements Runnable {
    private String name;

    @Override
    public void run() {
        System.out.println(name + "  job started by thread:  " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
            System.out.println("--------------------------------------------------");
        } catch (Exception vv) {
        }
        System.out.println(name + "  job completed by thread:  " + Thread.currentThread().getName());
    }

    public My(String name) {
        this.name = name;
    }
}
