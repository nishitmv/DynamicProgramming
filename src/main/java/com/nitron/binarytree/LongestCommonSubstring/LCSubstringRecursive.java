package com.nitron.binarytree.LongestCommonSubstring;
//


//////// NOT WORKING!!!!
public class LCSubstringRecursive {

    Integer[][] matrix;
    int result;

    public int calcLCSubstring(char[] str1, char[] str2, int m, int n) {

        matrix = new Integer[m + 1][n + 1];
        int count = 0;

        return Math.max(result, calcLCSubstring(str1, str2, m, n, count));

    }

    private int calcLCSubstring(char[] str1, char[] str2, int m, int n, int count) {

        if (m == 0 || n == 0)
            return count;

        if (matrix[m][n] != null)
            return matrix[m][n];

        if (str1[m - 1] == str2[n - 1])
            return matrix[m][n] = 1 + calcLCSubstring(str1, str2, m - 1, n - 1, count + 1);
        else {

            result = Math.max(result, count);
            count = 0;

            return matrix[m][n] = Math.max(calcLCSubstring(str1, str2, m, n - 1, count), calcLCSubstring(str1, str2, m - 1, n, count));

        }

    }

}
