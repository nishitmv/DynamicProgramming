package com.nitron.dpproblems.minsubsetsumdiff;

import java.util.ArrayList;
import java.util.List;

public class MinSubsetSumDifference {


    public int getMinSubsetSumDiff(int[] arr, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += arr[i];

        int halfSum = (int) Math.ceil((double) sum / 2);

        List<Integer> subsetSumList = new ArrayList<>();
        subsetSumList.add(0);
        for (int i = 1; i < halfSum; i++) {
            if (subsetSumExists(arr, n, i))
                subsetSumList.add(i);
        }
        System.out.println(subsetSumList);
        System.out.println(sum);
        int min = Integer.MAX_VALUE;

        for (int val : subsetSumList) {
            min = Math.min(min, sum - 2 * val);
        }

        return min;
    }

    private boolean subsetSumExists(int[] arr, int n, int sum) {

        if (n == 0)
            return false;
        if (sum == 0)
            return true;

        if (arr[n - 1] <= sum) {
            return subsetSumExists(arr, n - 1, sum - arr[n - 1]) || subsetSumExists(arr, n - 1, sum);
        } else
            return subsetSumExists(arr, n - 1, sum);

    }

}
