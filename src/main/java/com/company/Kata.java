package com.company;

import java.util.Arrays;

public class Kata
{
    private Kata() {
    }

    public static String sortTheInnerContent(String words)
    {
        String[] wordsList = words.split(" ");
        StringBuilder wordReverse = new StringBuilder();
        for (String word: wordsList
        ) {
            if(wordReverse.toString().equals("")){
                wordReverse.append(word.charAt(0) + sort(word.substring(1, word.length()-1)) + word.charAt(word.length()-1));
            } else {
                wordReverse.append(" " + (word.charAt(0) + sort(word.substring(1, word.length() - 1)) + word.charAt(word.length() - 1)));
            }
        }
        return wordReverse.toString();
    }

    private static String sort(String text) {
        char[] chars = (text).toCharArray();
        if(chars.length>=2){
            char[] charsReverse = new char[chars.length];
            Arrays.sort(chars);
            for (int i = 0; i <= chars.length -1 ; i++) {
                charsReverse[i] = chars[chars.length-i-1];
            }
            return new String(charsReverse);
        }
        else{
            return new String(chars);
        }
    }

    public static String addLetters(String... letters) {
        int sum = 0;
        for (int i = 0; i <letters.length; i++) {
            int value = (int)letters[i].charAt(0)-96;
            sum+=value;
        }
        int res = sum % 26;
        if (res==0)
            return "z";
        char charResult = (char)(res+96);
        return  String.valueOf(charResult);
    }
}
