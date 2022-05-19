package com.nitron.dpproblems.countofsubsets;

public class Main {

    public static void main(String[] args) {

        //int[] arr = {2,3,5,6,8,10};
        int[] arr = {1, 1, 2, 3};

        System.out.println(new SubsetCounter().countSubsets(arr, 4, 4));
    }

}
