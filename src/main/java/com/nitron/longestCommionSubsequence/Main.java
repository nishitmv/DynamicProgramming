package com.nitron.longestCommionSubsequence;

public class Main {

    public static void main(String[] args) {

        String str1 = "bl";
        String str2 = "yby" ;

        System.out.println(new LongestCommonSubSequence().calcLCS(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));

    }
}
