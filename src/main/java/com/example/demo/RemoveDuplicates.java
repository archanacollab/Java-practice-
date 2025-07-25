package com.example.demo;

import java.util.*;

public class RemoveDuplicates {

    public static void removeDuplicates(int[] arr) {
        Set<Integer> unique = new LinkedHashSet<>();

        for (int num : arr) {
            unique.add(num); // Set will skip duplicates
        }

        System.out.print("Array after removing duplicates: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1, 5, 2};
        removeDuplicates(arr);
    }
}
