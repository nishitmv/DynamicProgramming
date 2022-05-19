package com.nitron.dpproblems.KadanesMaxSubArray;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayCalc {
@Getter
int sum =Integer.MIN_VALUE;
Map<Integer, Integer> map = new HashMap<>();
    public void calcMaxSubArraySum(int[] arr) {

         calcMaxSubArraySum(arr,  arr.length);
    }

    private int calcMaxSubArraySum(int[] arr, int n) {

        if(n==0 )
            return 0;
        if(map.containsKey(n))
            return map.get(n);
        int val = Math.max(arr[n - 1], (calcMaxSubArraySum(arr, n - 1) + arr[n - 1]));

        sum = Math.max(val, sum);
         map.put(n, val);
         return val;

    }
}
