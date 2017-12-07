package com.thifty.anagram;

public class Reverse {

    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            if (!Character.isAlphabetic(ch[i])) {
                i++;
            } else if (!Character.isAlphabetic(ch[j])) {
                j--;
            } else {
                char newCh = ch[i];
                ch[i] = ch[j];
                ch[j] = newCh;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}
