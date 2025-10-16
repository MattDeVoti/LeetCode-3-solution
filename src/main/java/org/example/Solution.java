package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Longest substring without repeating characters is "vsqlptdaz"
        System.out.println(new Solution().lengthOfLongestSubstring("badvsqlptdaz"));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> subStringChars = new HashSet<>();

        int longestSubString = 0;

        int leftPointer = 0;
        int rightPointer = 0;

        while(rightPointer<s.length()){
            if(subStringChars.size()==0 || !subStringChars.contains(s.charAt(rightPointer))){
                subStringChars.add(s.charAt(rightPointer));
                rightPointer++;
            } else {
                subStringChars.remove(s.charAt(leftPointer));
                leftPointer++;
            }

            if((rightPointer-leftPointer)>longestSubString){
                longestSubString=(rightPointer-leftPointer);
            }
        }

        return longestSubString;
    }
}
