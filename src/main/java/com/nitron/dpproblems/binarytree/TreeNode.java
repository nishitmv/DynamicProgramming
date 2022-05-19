package com.nitron.dpproblems.binarytree;

import lombok.Data;

@Data
public class TreeNode {
    int value;
    TreeNode parent;
    TreeNode right;
    TreeNode left;

    public TreeNode(int value, TreeNode parent) {
        this.value = value;
        this.parent = parent;
    }


}
