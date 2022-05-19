package com.nitron.dpproblems.palindromPartitioning;

public class PalindromPartitioner {

    Integer[][] matrix;

    public int partition(String str) {
        matrix = new Integer[str.length()][str.length()];
        return calcPalindromePartition(str, 0, str.length() - 1);
    }

    public int calcPalindromePartition(String str, int i, int j) {
        if (i >= j)
            return 0;
        if (matrix[i][j] != null) {
            return matrix[i][j];
        }
        if (isPalindrome(str, i, j))
            return 0;

        int ans = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            if (matrix[i][k] == null)
                matrix[i][k] = calcPalindromePartition(str, i, k);

            if (matrix[k + 1][j] == null)
                matrix[k + 1][j] = calcPalindromePartition(str, k + 1, j);

            ans = Math.min(matrix[i][k] + matrix[k + 1][j] + 1, ans);
        }
        return matrix[i][j] = ans;

    }

    private boolean isPalindrome(String str, int i, int j) {

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
