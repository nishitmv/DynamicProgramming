package com.nitron.LongestCommonSubstring;

public class LCSubStringBottomUp {

    Integer[][] matrix ;
    public int calcLCSubstring(char[] str1, char[] str2, int m, int n) {

        matrix = new Integer[m+1][n+1];
        int count =0;

        for (int i=0;i<m+1;i++)
            matrix[i][0] =0;
        for (int j = 0; j < n + 1; j++)
            matrix[0][j] =0;

        for (int i = 1; i < m+1 ; i++)
            for (int j = 1; j < n+1 ; j++)
            {
                if(str1[i-1] == str2[j-1]) {
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];
                }
                else
                   matrix[i][j]=0;

                if(matrix[i][j]>count)
                    count = matrix[i][j];
            }

        return count;
    }


}
