package com.nitron.dpproblems.MatrixChainMultiplication;


public class Main {

    public static void main(String[] args) {

        int[] arr = {10,30,5,60, 20, 40};

        System.out.println(new MatrixChainMulti().calc(arr, 1, arr.length-1, 1000));

    }

}
