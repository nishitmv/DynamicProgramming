package com.nitron.numofsubsetsgivenDiff;

public class Main {

    public static void main(String[] args) {

        int[] arr = {4,6,7,3,2,1,5,9,11,8,21,14,19,16, 14, 17, 20};
        int diff = 35;
        Long start = System.currentTimeMillis();
        System.out.println(new NumOfSubsetsForGivenDiff().getNumOfSubsetsForGivenDiff(arr, arr.length, diff));
        Long time = System.currentTimeMillis()-start;
        System.out.println("TIME TAKEN : "+time);

    }

}
