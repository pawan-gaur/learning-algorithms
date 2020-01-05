package com.pgaur.tutorial.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {

        MyInterface myInterface = new LambdaExample();
        List<Student> sortStudent = new ArrayList<>();

        sortStudent.add(new Student("Umesh", 25));
        sortStudent.add(new Student("Pawan", 24));
        sortStudent.add(new Student("Prabhakar", 29));
        sortStudent.add(new Student("Ravish", 26));

        myInterface.sortStudents(sortStudent);
        for (Student student: sortStudent){
            System.out.println(student.getName() +"\t "+ student.getAge() );
        }

        System.out.println("-----------------------------------------");
        MyInterface.greet("Pawan");

        System.out.println("-----------------------------------------");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(12);
        integerList.add(8);
        integerList.add(2);
        Integer maxNum = myInterface.getMaxNum(integerList);
        System.out.println(maxNum);
    }

}
