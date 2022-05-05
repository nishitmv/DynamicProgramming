package com.nitron.BooleanParenthesization;

public class BooleanParenthesizer {

    private static final char TRUE = 'T';
    private static final char FALSE = 'F';

    public int calcWaysToParenthesize(String expr) {

        return calcWaysToParenthesize(expr, 0, expr.length() - 1, true);

    }

    private int calcWaysToParenthesize(String expr, int i, int j, boolean isTrue) {

        if (i > j)
            return 0;
        if (i == j) {
            if (isTrue)
               return  expr.charAt(i) == TRUE ?  1 : 0;
            else
                return expr.charAt(i) == FALSE ?  1 : 0;
        }
            int ans =0;
            for(int k =i+1; k<j; k+=2) // +2 as we need to skip chars (T/F) and hit operators, k is always operator . i+1 as 1st char is not operator .
            {
                int leftTrue = calcWaysToParenthesize(expr, i, k-1, true);
                int leftFalse = calcWaysToParenthesize(expr, i, k-1, false);
                int rightTrue =  calcWaysToParenthesize(expr, k+1, j, true);
                int rightFalse =  calcWaysToParenthesize(expr, k+1, j, false);
                ans = ans + evaluate(expr.charAt(k), leftTrue, leftFalse, rightTrue, rightFalse, isTrue);
            }
            return ans;
    }

    private int evaluate(char operator, int leftTrue, int leftFalse, int rightTrue, int rightFalse, boolean isTrue) {

        switch(operator)
        {
            case '&':
                if(isTrue)
                    return leftTrue*rightTrue;
                else
                    return leftTrue*rightFalse+rightTrue*leftFalse+leftFalse*rightFalse;
            case'|':
                if(isTrue)
                    return leftTrue*rightTrue+leftFalse*rightTrue+rightFalse*leftTrue;
                else
                    return leftFalse*rightFalse;
            case '^':
                if(isTrue)
                    return leftTrue*rightFalse+rightTrue*leftFalse;
                else
                    return leftTrue*rightTrue+leftFalse*rightFalse;
            default:
                return 0;
        }
    }

}
