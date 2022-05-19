package com.nitron.dpproblems.countofsubsets;

public class SubsetCounter {

    public int countSubsets(int[] arr, int n, int sum) {

        if (sum == 0) //if sum is 0 there is 1 subset of size 0 in every array
            return 1;
        if (n == 0) // if array size is 0 , no subsets except size 0 subset that's already returned .
            return 0;

        if (arr[n - 1] <= sum) {
            return countSubsets(arr, n - 1, sum - arr[n - 1]) + countSubsets(arr, n - 1, sum);
        } else {
            return countSubsets(arr, n - 1, sum);
        }

    }

}
