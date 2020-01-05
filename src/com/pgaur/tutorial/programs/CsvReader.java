package com.pgaur.tutorial.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReader {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("SampleCSVFile.csv"));
        scan.useDelimiter(",");

        while (scan.hasNext()){
            System.out.print(scan.next()+"|");
        }
        scan.close();
    }

}
