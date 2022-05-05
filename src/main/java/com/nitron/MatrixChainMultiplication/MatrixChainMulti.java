package com.nitron.MatrixChainMultiplication;

public class MatrixChainMulti {

    Integer[][] matrix;

    public int calc(int[] arr, int i, int j, int maxSize) {

        matrix = new Integer[maxSize+1][maxSize+1];

       return calcMinMatrixChain(arr, i, j);
    }


    public int calcMinMatrixChain(int[] arr, int i, int j) {

        if(i>=j) // Matrix requires i<j ; i==j means no matrix . i > j is impossible .
            return 0;

        if(matrix[i][j]!=null) {

            System.out.println("FOUND : "+i+" "+j+" "+matrix[i][j]);
            return matrix[i][j];
        }
        int ans =Integer.MAX_VALUE;
        for(int k =i;k<j;k++)
        {
            // i to k + k+1 to j + mid ( product start, mid and end)
            int tempans = calcMinMatrixChain(arr, i, k)+ calcMinMatrixChain(arr, k+1, j)+(arr[i-1]*arr[k]*arr[j]); // k can only be less than j , k==j is no matrix .

           ans = Math.min(tempans, ans);

        }
        return matrix[i][j] = ans;
    }
}
