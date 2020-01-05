package com.pgaur.tutorial.lambda;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

    //default method can be override
    default List<Student> sortStudents(List<Student> stuList) {
        Collections.sort(stuList);
        return stuList;
    }

    //Can't be override
    static void greet(String name) {
        System.out.println("Welcome : " + name);
    }

    public abstract Integer getMaxNum(List<Integer> integerList);

}
