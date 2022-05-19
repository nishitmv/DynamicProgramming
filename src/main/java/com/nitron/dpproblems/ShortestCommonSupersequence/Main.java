package com.nitron.dpproblems.ShortestCommonSupersequence;

public class Main {

    public static void main(String[] args) {

        String str1 = "AGGTABS";
        String str2 = "GXTXAYB";


        new ShortestCommonSuperSeq().calcShortestCommonSuperSeq(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length());
    }
}
