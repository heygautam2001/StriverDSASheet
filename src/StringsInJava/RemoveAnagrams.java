package StringsInJava;

import java.util.*;
// Leet-code 2273
public class RemoveAnagrams {
    public static List<String> removeAnagrams(String[] words) {
       List<String> list = new ArrayList<>();

        String prevSorted = "";
        for(String word : words){
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String currSorted = new String(wordArr);
            if(!currSorted.equals(prevSorted)){
                list.add(word);
                prevSorted = currSorted;
            }
        }

       return list;


    }
    public static void main(String[] args) {
        String[]anagram = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(anagram));

    }
}


//        Initialize an empty list result
//
//        Initialize a string prevSorted as empty
//
//        For each word in words:
//
//        Convert the word to a character array
//
//        Sort the character array
//
//        Convert it back to a string → currSorted
//
//        If currSorted is not equal to prevSorted:
//
//        Add the original word to result
//
//        Update prevSorted = currSorted
//
//        Return result