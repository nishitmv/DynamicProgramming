package com.nitron.LongestPalindromeSubsequence;

public class LongestPalindromeSubSequence {

Integer[][] matrix;
    public int calcLPS(String str1) {

        matrix = new Integer[str1.length()+1][str1.length()+1];

        return calcLCS(str1, new StringBuilder(str1).reverse().toString(), str1.length(), str1.length());

    }

    private int calcLCS(String str1, String str2, int m, int n) {

        if(m==0 || n==0)
            return 0;

        if(matrix[m][n]!=null)
            return matrix[m][n];

        if(str1.charAt(m-1)== str2.charAt(n-1))
        {
            return matrix[m][n] = 1+ calcLCS(str1,str2,m-1,n-1);
        }
        else
            return matrix[m][n] = Math.max(calcLCS(str1, str2, m, n-1), calcLCS(str1, str2, m-1, n));

    }
}
