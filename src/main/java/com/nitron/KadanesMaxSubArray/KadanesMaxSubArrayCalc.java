package com.nitron.KadanesMaxSubArray;

public class KadanesMaxSubArrayCalc {

    int result ;
    int currMax;

    public int calcMaxSubArray(int[] arr)
    {
        result = arr[0];
        currMax = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currMax = Math.max(arr[i], currMax+arr[i] );
            result= Math.max(currMax, result);
        }
        return result;
    }
}
