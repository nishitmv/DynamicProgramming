package com.nitron.leetcode.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciCalc {

    Map<Integer, Integer> map = new HashMap<>();

    public int calc(int val) {

        if(val<=1)
            return 1;
        if(!map.containsKey(val))
             map.put(val, calc(val-1)+ calc(val-2));

        return map.get(val);

    }
}
