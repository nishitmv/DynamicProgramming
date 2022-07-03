package com.nitron.dpproblems.OddEvenJumps;

import java.util.TreeMap;

public class OddEvenJumps {

    boolean[] higherCache;
    boolean[] lowerCache;
    int count =1;

    public int countJumps(int[] arr) {

        int n = arr.length;
        higherCache = new boolean[n];
        lowerCache = new boolean[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        higherCache[n-1] =true;
        lowerCache[n-1] =true;

        map.put(arr[n-1], n-1);

        for(int i=n-2;i>=0;i--) {
            if( countJumps(arr, i, n - 1, map, true))
                count++;
            // Do the countJumps for lower so that lowerCache has data for i, else it's an issue as we use ceil
            // and it gets stuck on same node and gives incorrect results.
            countJumps(arr, i, n - 1, map, false);

            map.put(arr[i], i);
        }
        return count;
    }

    private boolean countJumps(int[] arr, int i, int n, TreeMap<Integer, Integer> map, Boolean higher) {


        if( higher) {
            if(higherCache[i]) {

                return true;
            }
            var higherValue = map.ceilingEntry(arr[i]);
            if (higherValue != null && higherValue.getValue()>i) {
                return higherCache[i] = countJumps(arr, higherValue.getValue(), n, map, false);
            }
        }
        if( !higher) {
            if(lowerCache[i]) {

                return true;
            }
            var lowerValue = map.floorEntry(arr[i]);
            if (lowerValue != null && lowerValue.getValue()>i) {
                return lowerCache[i] = countJumps(arr, lowerValue.getValue(), n, map, true);
            }
        }

        // return true if i reached the end , i.e its a valid path from i to n with odd and even jumps ( high and low jumps)
        return i == n;
    }
}
