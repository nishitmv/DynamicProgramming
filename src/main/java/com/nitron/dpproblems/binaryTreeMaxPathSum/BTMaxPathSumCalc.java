package com.nitron.dpproblems.binaryTreeMaxPathSum;

import com.nitron.dpproblems.binarytree.TreeNode;
import lombok.Getter;

public class BTMaxPathSumCalc {

    @Getter
    int result =Integer.MIN_VALUE;
    public int calcBTMaxPathSum(TreeNode rootNode) {

        if(rootNode==null)
            return 0;

        int leftSum = calcBTMaxPathSum(rootNode.getLeft());
        int rightSum = calcBTMaxPathSum(rootNode.getRight());

        int currNodeSum = rootNode.getValue()+leftSum+rightSum;

        int currNodeValueToPass = rootNode.getValue()+Math.max(leftSum,rightSum);

        int maxOfCurrNodeValAndSubTreeSums = Math.max(Math.max(currNodeSum, currNodeValueToPass),rootNode.getValue());

        result = Math.max(maxOfCurrNodeValAndSubTreeSums, result);

        return currNodeValueToPass;

    }
}
