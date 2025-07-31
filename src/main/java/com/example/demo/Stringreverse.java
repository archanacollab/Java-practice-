package com.example.demo;

public class Stringreverse {

  public static String reverse(String stringtoreverse) {
      String reversedstring="";

        for (int i=stringtoreverse.length()-1;i>=0;i--)
        {
            reversedstring+=stringtoreverse.charAt(i);
        }
        return reversedstring;
    }
    public static void main(String[] args) {
        String stringtoreverse = "Malayalam";
       String result= reverse(stringtoreverse);
        System.out.println("Reversed string is "+result);
    }
}
