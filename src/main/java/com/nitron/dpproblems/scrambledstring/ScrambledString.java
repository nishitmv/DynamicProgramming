package com.nitron.dpproblems.scrambledstring;

import java.util.HashMap;
import java.util.Map;

public class ScrambledString {

    Map<Integer, Boolean> map = new HashMap<>();

    public boolean scrambledStrings(String str1, String str2) {
        return areScrambledStrings(str1, str2);
    }

    private boolean areScrambledStrings(String str1, String str2) {
        int n = str1.length();
        if (str1.length() != str2.length())
            return false;
        if (str1.equals(str2))
            return true;
        if (str1.length() <= 1)
            return false;
        boolean result = false;


        // If first part of string s1 (0 to i index)== first part of string s2 && second part od string s1 (i to n ) == second part of string s2 . return true
        // else if first part of string s1 (0 to i index)== econd part of string s2 && first part of string s2 == second part od string s1 (i to n ) . return true .
        for (int i = 1; i < n; i++) {
            if (map.containsKey(i))
                result = map.get(i);
            else {
                result = (areScrambledStrings(str1.substring(0, i), str2.substring(0, i)) && areScrambledStrings(str1.substring(i), str2.substring(i)))
                        ||
                        (areScrambledStrings(str1.substring(0, i), str2.substring(n - i)) && areScrambledStrings(str1.substring(n - i), str2.substring(0, i)));
                map.put(i, result);
                if (result) break;

            }
        }
        return result;
    }
}
