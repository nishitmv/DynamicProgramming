package com.nitron.binaryTreeMaxPathSumLeaftoLeaf;

import com.nitron.binarytree.TreeNode;
import lombok.Getter;

public class BTMaxPathLeafSumCalc {

    @Getter
    int result = Integer.MIN_VALUE;
    public int calcBTMaxPathSumLeaf(TreeNode rootNode) {

        if(rootNode==null)
            return 0;

        int leftTreeSum = calcBTMaxPathSumLeaf(rootNode.getLeft());
        int rightTreeSum = calcBTMaxPathSumLeaf(rootNode.getRight());


            int currNodeSum = rootNode.getValue()+leftTreeSum+rightTreeSum;
            int sumToPassToParent = rootNode.getValue()+Math.max(leftTreeSum, rightTreeSum);

        if(rootNode.getLeft()==null && rootNode.getRight()==null)
        {
            sumToPassToParent =  Math.max(rootNode.getValue(), rootNode.getValue());
        }

        int maxofAll = Math.max(currNodeSum, sumToPassToParent);

        result = Math.max(maxofAll, result);

        return sumToPassToParent;
    }
}
