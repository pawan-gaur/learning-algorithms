package com.pgaur.tutorial.thread;

class RunnableThreadDemo implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread : " + Thread.currentThread().getId() + " is Running");
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Thread thread = new Thread(new RunnableThreadDemo());
            //thread.run();
            thread.start();
        }
    }
}
