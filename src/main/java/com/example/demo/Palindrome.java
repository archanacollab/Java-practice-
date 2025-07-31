package com.example.demo;

public class Palindrome {

  public static void checkPalindrome(String arr) {
      int start = 0;
      int end = arr.length() - 1;
      while (start < end) {
          if (arr.charAt(start) !=arr.charAt(end)) {
              System.out.println("The given string is not a palindrome");
              return;
          }

          start++;
          end--;
      }
      System.out.println("The given string is a palindrome");
  }

    public static void main(String[] args) {
        String  arr = "madam";
    checkPalindrome(arr);

    }
}
