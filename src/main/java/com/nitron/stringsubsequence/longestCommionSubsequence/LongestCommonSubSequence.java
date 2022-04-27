package com.nitron.stringsubsequence.longestCommionSubsequence;

public class LongestCommonSubSequence {

    Integer[][] matrix;

    public int calcLCS(char[] str1, char[] str2, int m, int n) {
        matrix = new Integer[m + 1][n + 1];

        int result = calcLongestCommonSubsequence(str1, str2, m, n);

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
        return result;
    }

    public int calcLongestCommonSubsequence(char[] str1, char[] str2, int m, int n) {
        if (m == 0 || n == 0)
            return 0;

        if (matrix[m][n] != null)
            return matrix[m][n];

        if (str1[m - 1] == str2[n - 1]) {
            return matrix[m][n] = 1 + calcLongestCommonSubsequence(str1, str2, m - 1, n - 1);
        } else
            return matrix[m][n] = Math.max(calcLongestCommonSubsequence(str1, str2, m - 1, n), calcLongestCommonSubsequence(str1, str2, m, n - 1));
    }

}
