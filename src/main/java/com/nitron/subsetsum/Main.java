package com.nitron.subsetsum;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 11;
        System.out.println(new SubsetSum().isSubsetSum(6, arr, sum));
    }


}
