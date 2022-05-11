package com.nitron.printingSCS;

public class ShortestCommonSuperSeqPrinter {

    Integer[][] matrix ;
    public void printShortestCommonSuperSeq(char[] str1, char[] str2, int m, int n) {

        matrix = new Integer[m+1][n+1];

        int lcsLength = calcLCS(str1, str2, m, n);

        System.out.println("SCS LENGTH : "+ (m+n-lcsLength));
        StringBuilder builder = new StringBuilder();
        int i=m; int j =n;
        while(i>0 && j>0)
            {
                if(str1[i-1] == str2[j-1]) {
                    builder.append(str1[i - 1]);
                    i--; j--;
                }
                else{
                    if(matrix[i-1][j]>matrix[i][j-1]) {
                        builder.append(str1[i-1]); // Append String 1 non common subsequence
                        i--;
                    }
                    else {
                        builder.append(str2[j-1]);// Append String 2 non common subsequence
                        j--;
                    }
                    }
            }

        // NOW APPEND THE REMAINING PART OF str1 and str2
        while(i>0) {
            builder.append(str1[i - 1]);
            i--;
        }
        while(j>0) {
            builder.append(str2[j - 1]);
            j--;
        }
        System.out.println(builder.reverse());
    }

    private int calcLCS(char[] str1, char[] str2, int m, int n) {

        if(m==0|| n==0)
            return 0;

        if(matrix[m][n]!=null)
            return matrix[m][n];

        if(str1[m-1]==str2[n-1])
            return matrix[m][n] = 1+calcLCS(str1, str2, m-1, n-1);
        else
            return matrix[m][n] = Math.max(calcLCS(str1, str2, m, n-1), calcLCS(str1,str2, m-1, n));
    }
}
