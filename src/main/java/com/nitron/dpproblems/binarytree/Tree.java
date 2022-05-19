package com.nitron.dpproblems.binarytree;

import lombok.Data;

@Data
public class Tree {

    TreeNode rootNode;

    public boolean isEmpty() {
        return rootNode == null;
    }


}
