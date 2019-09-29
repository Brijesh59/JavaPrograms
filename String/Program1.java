/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false

You may assume the string contains only lowercase alphabets.
What if the inputs contain unicode characters? How would you adapt your solution to such case?

NOTE: This is Leetcode Problem 242. [ https://leetcode.com/problems/valid-anagram/ ]

*/



class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int arr[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[ s.charAt(i) - 'a' ]++;
            arr[ t.charAt(i) - 'a' ]--;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
