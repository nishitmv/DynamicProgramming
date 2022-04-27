package com.nitron.equalsumpartition;

public class EqualSumPartitioner {


    public boolean canBePartitioned(int[] arr, int size) {
        Boolean[][] matrix;
        int sum = 0;
        for (int i : arr)
            sum += i;
        if (sum % 2 != 0)
            return false;
        else {
            matrix = new Boolean[sum + 1][size + 1];
            return subsetSum(arr, sum / 2, size);
        }
    }

    private boolean subsetSum(int[] arr, long sum, int n) {

        if (n == 0)
            return false;
        if (sum == 0)
            return true;
        if (arr[n - 1] <= sum) {
            return subsetSum(arr, sum - arr[n - 1], n - 1) || subsetSum(arr, sum, n - 1);
        } else {
            return subsetSum(arr, sum, n - 1);
        }

    }

}
