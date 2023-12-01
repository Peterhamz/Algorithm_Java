package com.example.algorithms_java.easy_grade;

public class Two_String_Arrays_Equivalent {

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        // Check if the arrays represent the same string
        boolean result = arrayStringsAreEqual(word1, word2);

        // Output the result
        System.out.println(result); // Output: true
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String concatWord1 = concatinatedWord(word1);
        String concatWord2 = concatinatedWord(word2);

        if (concatWord1.equals(concatWord2)){
            return true;
        }
        return false;
    }

    public static String concatinatedWord(String[] words){
        StringBuilder buildWord = new StringBuilder();

        for(String word : words){
            buildWord.append(word);
        }
        return buildWord.toString();
    }


    public boolean arrayStringsAreEqualHashMap(String[] word1, String[] word2) {

        return false;
    }

}
