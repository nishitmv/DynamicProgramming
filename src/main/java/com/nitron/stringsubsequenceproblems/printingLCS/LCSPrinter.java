package com.nitron.stringsubsequenceproblems.printingLCS;

public class LCSPrinter {
    Integer[][] matrix;

    public void printLCS(char[] str1, char[] str2, int m, int n) {
        StringBuilder result = new StringBuilder();
        matrix = new Integer[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++)
            matrix[i][0] = 0;
        for (int j = 0; j < n + 1; j++)
            matrix[0][j] = 0;
        // Generate matrix recursive top down or iterative bottom up LCS .
        for (int i = 1; i < m + 1; i++)
            for (int j = 1; j < n + 1; j++) {
                if (str1[i - 1] == str2[j - 1]) {
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];

                } else {
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
                }
            }
        System.out.println(matrix[m][n]);

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            if (str1[i - 1] == str2[j - 1]) {
                result.append(str1[i - 1]);
                i--;
                j--; //Go back diagonally from m+1 , n+1 towards 0, 0
            } else {
                if (matrix[i - 1][j] > matrix[i][j - 1])
                    i--;
                else
                    j--;
            }
        }

        System.out.println(result.reverse());

    }

}
