package com.example.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Largest {

  public static int findLargest(int[] arr) {
        int max=arr[0];
        for (int i=1,j=0;i<arr.length;j++,i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1, 5, 2,999};
       int result= findLargest(arr);
        System.out.println("largest element is"+result);
    }
}
