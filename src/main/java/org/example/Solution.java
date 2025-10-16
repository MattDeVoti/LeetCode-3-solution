package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Longest substring without repeating characters is "abcdlu"
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcdlubaksa"));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> subStringChars = new HashSet<>();

        int longestSubString = 0;

        for(char c : s.toCharArray()){
            if(subStringChars.size()==0 || !subStringChars.contains(c)){
                subStringChars.add(c);
            } else {
                longestSubString = longestSubString < subStringChars.size() ? subStringChars.size() : longestSubString;
                subStringChars.clear();
                subStringChars.add(c);
            }
        }

        return longestSubString;
    }
}