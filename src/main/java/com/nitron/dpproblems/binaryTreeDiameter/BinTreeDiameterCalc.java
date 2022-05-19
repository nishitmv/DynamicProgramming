package com.nitron.dpproblems.binaryTreeDiameter;

import com.nitron.dpproblems.binarytree.TreeNode;
import lombok.Getter;

import static java.lang.Math.max;

public class BinTreeDiameterCalc {
    @Getter
    int result=0;
    public int calcBTDiameter(TreeNode rootNode) {

        if(rootNode==null)
            return 0;

        int leftHeight = calcBTDiameter(rootNode.getLeft());
        int rightHeight = calcBTDiameter(rootNode.getRight());

        int currNodeDia = 1 + leftHeight+rightHeight;
        int parentNodeHeight = max(leftHeight, rightHeight)+1;
        int maxOfCurNodeDiaAndParentHeight = max(currNodeDia, parentNodeHeight);

        result = max(maxOfCurNodeDiaAndParentHeight, result);

        return parentNodeHeight; // return parent node height to be used for calculating diameter of next higher node viz. parent.

    }
}
