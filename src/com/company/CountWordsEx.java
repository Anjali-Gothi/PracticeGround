package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWordsEx {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        StringTokenizer st=new StringTokenizer(s);
        System.out.println(st.countTokens());
        char[] chars = s.toCharArray();
        int count = 0;
        boolean word = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(chars[i]) && i != s.length() - 1) {
                word = true;
            } else if (!Character.isLetter(chars[i]) && word) {
                count++;
                word = false;
            } else if (Character.isLetter(chars[i]) && i == s.length() - 1) {
                count++;
            }
        }
        System.out.println("No of words in string " + s + "are " + count);
    }
}
