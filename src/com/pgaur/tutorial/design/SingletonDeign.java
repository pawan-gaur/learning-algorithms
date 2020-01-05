package com.pgaur.tutorial.design;

public class SingletonDeign {

    private static SingletonDeign instance;

    private SingletonDeign(){
    }

    public static SingletonDeign getInstance(){
        if(instance ==  null){
            instance = new SingletonDeign();
        }
        return instance;
    }
}
