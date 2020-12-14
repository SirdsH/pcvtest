package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        Random r1 = new Random();
        for (int i = 0; i < 100; i++) {
            arr1.add(r1.nextInt(50));
        }
        List<Integer> arr2 = new ArrayList<>();
        Random r2 = new Random();
        for (int i = 0; i < 100; i++) {
            arr2.add(r2.nextInt(100));
        }
        if (arr1.equals(arr2.size())){
            System.out.println("Ano");
        }
        else {
            System.out.println("Ne");
            arr1.retainAll(arr2);
            System.out.println(arr1);   
        }
    }
}
