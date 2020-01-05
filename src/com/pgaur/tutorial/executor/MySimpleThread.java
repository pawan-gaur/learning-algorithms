package com.pgaur.tutorial.executor;

public class MySimpleThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            try {
                System.out.println("Thread Running : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }catch (Exception vv){
            }
        }
    }

    public static void main(String[] args) throws Exception {
        MySimpleThread simpleThread = new MySimpleThread();
        simpleThread.start();
        simpleThread.join();
        MySimpleThread simpleThread1 = new MySimpleThread();
        simpleThread1.start();
    }
}
