package com.nitron.dpproblems.eggDroppingProblem;

public class EggDroppingProblemSolver {

    Integer[][] matrix;
    public int solve(int f, int e) {
         matrix = new Integer[f+1][e+1];
        return solveEggDroppingProblem(f,e);
    }

    private int solveEggDroppingProblem(int f, int e) {

         if(e==0)
             return 0;
        if( matrix[f][e] != null)
            return  matrix[f][e];
         if(f==0 || f==1)
             return 1;
         if(e==1)
             return f;
         int ans = Integer.MAX_VALUE;
         for(int i=1; i<=f; i++)
         {
             int lowerFloorSoln ;
             int higherFloorSoln ;
             if( matrix[i-1][e-1]!= null )
             {
                 lowerFloorSoln = matrix[i-1][e-1];
             }
             else {
                 lowerFloorSoln = matrix[i-1][e-1] = solveEggDroppingProblem(i-1, e-1);
             }
             if( matrix[f-i][e]!= null )
             {
                 higherFloorSoln = matrix[f-i][e];
             }
             else{
                 higherFloorSoln = matrix[f-i][e] = solveEggDroppingProblem(f-i, e);
             }

            int tempAns =  1+ Math.max(lowerFloorSoln, higherFloorSoln);
             matrix[f][e] = ans = Math.min(ans, tempAns);
         }

        return ans;

    }
}
