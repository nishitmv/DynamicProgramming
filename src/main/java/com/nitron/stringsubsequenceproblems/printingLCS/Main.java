package com.nitron.stringsubsequenceproblems.printingLCS;

public class Main {

    public static void main(String[] args) {

        String str1 = "AGGTABS";
        String str2 = "GXTXAYB";

        //  System.out.println(new LongestCommonSubSequence().calcLCS(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));

        //System.out.println(new LCSBottomUp().calcLCS(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));
        new LCSPrinter().printLCS(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length());
    }
}
