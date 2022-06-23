package com.nitron.leetcode.UniquePaths;

public class UniqiePathsFinder  {

    Integer[][] matrix;
    public int FindUniquePaths(int m,  int n)
    {
        matrix = new Integer[m+1][n+1];

               return findUniquePath( m, n);

    }

    private int findUniquePath(int i, int j) {

        if(matrix[i][j] != null)
            return matrix[i][j];

        if(i==1 || j==1)
            return 1;

          return  matrix[i][j] = findUniquePath(i-1, j )  + findUniquePath(i, j-1);


    }

}
