package com.nitron.dpproblems.LongestRepeatingSubsequence;

public class LongestRepeatingSubSequence {

    int [][] matrix ;
    public void calcLongestRepeatingSubsequence(String str1) {

        matrix = new int[str1.length()+1][str1.length()+1];

        char[] s1 = str1.toCharArray();
        char[] s2 = str1.toCharArray();

        int m = s1.length;
        int n = s2.length;

        for(int i=0; i<m+1; i++)
            matrix[i][0] =0;

        for(int j=0; j<n+1; j++)
            matrix[0][j] =0;

        for(int i=1;i<m+1; i++)
            for(int j=1; j<n+1; j++)
            {
                // IMPORTANT i != j for repeating subsequence .
                // Else it's a standard subsequence and a waste as s1 == s2
                if(s1[i-1]== s2[j-1] && i!=j)
                {
                    matrix[i][j] = 1+matrix[i-1][j-1];
                }
                else
                {
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        System.out.println(matrix[m][n]);

    }
}
