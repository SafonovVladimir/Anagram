package com.thifty.anagram;

public class Anagram {

    private static String str = "a1bcd efg!h";

    public static void main(String[] args) {
/*All non-letter symbols should stay on the same places.
E.g. "a1bcd efg!h" => "d1cba hgf!e"
Use Latin alphabet for test only.*/

        System.out.println("Write anagram followed string: 'a1bcd efg!h'. ");
        System.out.println("All non-letter symbols should stay on the same places. ");

        String sub1 = str.substring(0, 5);
        String sub2 = str.substring(6, 11);
        Reverse newString = new Reverse();

        System.out.println("Result: " + (newString.reverseString(sub1) + " " + newString.reverseString(sub2)));

    }


}
