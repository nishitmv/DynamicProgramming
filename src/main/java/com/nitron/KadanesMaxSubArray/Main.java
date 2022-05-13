package com.nitron.KadanesMaxSubArray;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5,4,-1,7,8};
      //  var maxSubArrCalc = new MaxSubArrayCalc();
       // maxSubArrCalc.calcMaxSubArraySum(arr);
        System.out.println(new KadanesMaxSubArrayCalc().calcMaxSubArray(arr));

    }

}
