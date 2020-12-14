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
            arr1.add(r1.nextInt(100));
            Collections.sort(arr1);
        }
        System.out.println(arr1);
        List<Integer> arr2 = new ArrayList<>();
        Random r2 = new Random();
        for (int i = 0; i < 50; i++) {
            arr2.add(r2.nextInt(100));
            Collections.sort(arr2);
        }
        System.out.println(arr2);
            if (arr1.equals(arr2)){
                System.out.println("Pole jsou stejná");
            }
            else {
                for (int i = 0; i < arr2.size(); i++) {
                    if (arr1.get(i)!=arr2.get(i)){
                        arr2.set(i, arr1.get(i));
                    }
                }
                for (int i = arr1.size() -1; i > 49; i--) {
                   arr1.remove(i);
                }
                System.out.println(arr1);
                System.out.println(arr2);
            }
    }
}
