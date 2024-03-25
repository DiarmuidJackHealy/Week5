package com.sparta.dh.collectionstask;

import java.util.HashSet;
import java.lang.Integer;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println(makeFiveSet(20));
        System.out.println(longWordList("Hello dj! How are you keeping today son?"));
    }
    static HashSet<Integer> makeFiveSet(int max) {
        HashSet<Integer> nums = new HashSet<>();
        for(int i=1; i<=max; i++) {
            if(i % 5 == 0) {
//                if(i != 0) {
//                    nums.add(i);
//                }
                nums.add(i);
            }
        }
        return nums;
    }
    static ArrayList<String> longWordList(String sentence) {
        ArrayList<String> wordList = new ArrayList<>();
        for(String word: sentence.split(" ")) {
            if(word.length() >= 5) {
                wordList.add(word);
            }
        }
        return wordList;
    }
}
