package com.pgaur.tutorial.thread;

class MultiThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread : " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        /*for (int i = 0; i < 8; i++) {
            MultiThread multithread = new MultiThread();
            multithread.start();
        }*/
        try{
            System.out.println("Hello");
            Thread.currentThread().join();
            System.out.println("End");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
