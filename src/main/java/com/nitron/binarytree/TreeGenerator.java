package com.nitron.binarytree;

import java.util.List;

public class TreeGenerator {

    public Tree generateTree(List<Integer> values) {

        Tree tree = new Tree();
        values.forEach(value -> {
            if (tree.isEmpty())
                tree.setRootNode(new TreeNode(value, null));
            else {
                TreeNode rootNode = tree.getRootNode();
                insert(rootNode, value);
            }
        });

        var root = tree.getRootNode();
        //  traverse(root);
       // System.out.println(height(root));
        return tree;
    }

    private void insertInOrder(TreeNode node, Integer value)
    {

    }

    private void insert(TreeNode node, Integer value) {

        if (node.getValue() > value) {
            if (node.getLeft() != null) {
                insert(node.getLeft(), value);
            } else {
                TreeNode newNode = new TreeNode(value, node);
                node.setLeft(newNode);

            }
        } else if (node.getValue() < value) {
            if (node.getRight() != null) {
                insert(node.getRight(), value);
            } else {
                TreeNode newNode = new TreeNode(value, node);
                node.setRight(newNode);

            }
        }
    }

    public void traverse(TreeNode node) {
        System.out.println(node.getValue());
        if (node.getLeft() != null)
            traverse(node.getLeft());

        if (node.getRight() != null)
            traverse(node.getRight());
    }

    public int height(TreeNode node) {
        if (node != null) {

            int height = 1 + Math.max(height(node.getLeft()), height(node.getRight()));
            System.out.println(height);
            return height;
        } else return 0;
    }
}
