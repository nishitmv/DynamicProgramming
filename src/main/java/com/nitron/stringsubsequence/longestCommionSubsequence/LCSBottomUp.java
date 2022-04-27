package com.nitron.stringsubsequence.longestCommionSubsequence;


public class LCSBottomUp {

    Integer[][] matrix;

    public int calcLCS(char[] str1, char[] str2, int m, int n) {
        matrix = new Integer[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++)
            matrix[i][0] = 0;
        for (int j = 0; j < n + 1; j++)
            matrix[0][j] = 0;

        for (int i = 1; i < m + 1; i++)
            for (int j = 1; j < n + 1; j++) {
                if (str1[i - 1] == str2[j - 1])
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];
                else
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
            }
        return matrix[m][n];
    }
}