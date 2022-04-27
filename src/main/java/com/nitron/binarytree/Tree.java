package com.nitron.binarytree;

import lombok.Data;

@Data
public class Tree {

    TreeNode rootNode;

    public boolean isEmpty() {
        return rootNode == null;
    }


}
