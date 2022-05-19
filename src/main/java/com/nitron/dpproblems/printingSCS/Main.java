package com.nitron.dpproblems.printingSCS;

public class Main {

    public static void main(String[] args) {

        String str1 = "AGGTABS";
        String str2 = "GXTXAYB";


        new ShortestCommonSuperSeqPrinter().printShortestCommonSuperSeq(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length());
    }

}
