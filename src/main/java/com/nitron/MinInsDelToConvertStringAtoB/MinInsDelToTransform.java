package com.nitron.MinInsDelToConvertStringAtoB;

public class MinInsDelToTransform {
    public void calcMinInsDel(String str1, String str2) {

        int m = str1.length();
        int n = str2.length();

        int lcsLength = calcLCS(str1.toCharArray(), str2.toCharArray(), m, n);

        int deletions = m - lcsLength;
        int additions = n - lcsLength;

        System.out.println("Number of Deletions " + deletions);
        System.out.println("Number of Additions " + additions);

    }

    private int calcLCS(char[] str1, char[] str2, int m, int n) {

        int[][] matrix = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++)
            matrix[i][0] = 0;
        for (int j = 0; j < m + 1; j++)
            matrix[0][j] = 0;

        for (int i = 1; i < m + 1; i++)
            for (int j = 1; j < n + 1; j++) {
                if (str1[i - 1] == str2[j - 1])
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];
                else
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);

            }
        return matrix[m][n];

    }
}
