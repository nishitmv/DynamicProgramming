package com.nitron.leetcode.IncreasingTripletSubsequence;

import java.util.Arrays;

public class IncrTripletSubSequence {

    public static void main(String[] args) {

        int[] nums = {2,1,5,0,4,6};

        System.out.println(new IncrTripletSubSequence().increasingTriplet(nums));

    }


    public boolean increasingTriplet(int[] nums) {

        if(nums.length<3)
            return false;

        int[] cache = new int[nums.length];

        Arrays.fill(cache, 1);


        for(int i =0; i<nums.length; i++)
            for(int j=i; j<nums.length; j++)
            {
                if(nums[j]>nums[i])
                {

                    cache[j] = Math.max(cache[j], cache[i]+1);

                }
                if(cache[j]==3)
                    return true;
            }

        return false;

    }

}
