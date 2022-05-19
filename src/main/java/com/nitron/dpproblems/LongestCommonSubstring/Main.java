package com.nitron.dpproblems.LongestCommonSubstring;

public class Main {

    public static void main(String[] args) {

        String str1 = "abcdxyz";
        String str2 = "xyzabcd";

        System.out.println(new LCSubStringBottomUp().calcLCSubstring(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));
        //  System.out.println(new LCSubstringRecursive().calcLCSubstring(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));
    }
}
