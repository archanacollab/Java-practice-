package com.example.demo;

public class NonrepeatingcharachterinString {

  public static char checkNonrepeating(String stringtocheck) {

      for(int i=0;i<stringtocheck.length();i++)
      {
       char c=stringtocheck.charAt(i);
          if (stringtocheck.indexOf(c) == stringtocheck.lastIndexOf(c)) {
              return c;
          }

      }

      return '-';
    }
    public static void main(String[] args) {
        String stringtocheck = "malayalam";
       char result= checkNonrepeating(stringtocheck);
        System.out.println("Non repeating charachter is  "+result);
    }
}
