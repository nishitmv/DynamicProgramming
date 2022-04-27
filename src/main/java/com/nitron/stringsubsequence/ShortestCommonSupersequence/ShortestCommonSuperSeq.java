package com.nitron.stringsubsequence.ShortestCommonSupersequence;

public class ShortestCommonSuperSeq {

    Integer[][] matrix;
    public void calcShortestCommonSuperSeq(char[] str1, char[] str2, int m, int n) {

        matrix = new Integer[m+1][n+1];
        int lcsLength = calcLongestCommonSubSeq(str1, str2, m, n);
        int shortestCommonSuperSeqLength = m+n-lcsLength;
        System.out.println(shortestCommonSuperSeqLength);
    }

    private int calcLongestCommonSubSeq(char[] str1, char[] str2, int m, int n) {

        if(m==0 || n==0 )
            return 0;

        if(matrix[m][n]!=null)
            return matrix[m][n];

        if(str1[m-1]==str2[n-1])
            return matrix[m][n] = 1+ calcLongestCommonSubSeq(str1, str2, m-1, n-1);

        else
            return matrix[m][n] = Math.max(calcLongestCommonSubSeq(str1, str2, m, n-1), calcLongestCommonSubSeq(str1, str2, m-1, n));

    }
}
