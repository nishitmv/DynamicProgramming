package com.nitron.MatrixChainMultiplication;

import com.nitron.MatrixChainMultiplicationFORMAT.MatrixChainMultiFormat;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10,30,5,60};

        System.out.println(new MatrixChainMulti().calc(arr, 1, arr.length-1));

    }

}
