package com.nitron.binarytree;

import java.util.List;

public class TreeGenerator {

    public void generateTree(List<Integer> values)
    {

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
        System.out.println(height(root));
    }

    private void insert( TreeNode node, Integer value) {

        if(node.getValue()>value)
        {
            if(node.getLeft()!=null){
                insert(node.getLeft(), value);
            }
            else {
                TreeNode newNode = new TreeNode(value, node);
                node.setLeft(newNode);
            }
        }
        else if(node.getValue()<value )
        {
            if(node.getRight()!=null){
                insert( node.getRight(), value);
            }
            else {
                TreeNode newNode = new TreeNode(value, node);
                node.setRight(newNode);
            }
        }
    }

    private void traverse(TreeNode node)
    {

        if(node.getLeft()!=null)
            traverse(node.getLeft());
        System.out.println(node.getValue());
        if(node.getRight()!=null)
            traverse(node.getRight());
    }

    private int height(TreeNode node)
    {
        if(node!=null) {

            int height =  1+Math.max(height(node.getLeft()), height(node.getRight()));
            System.out.println(height);
            return height;
        }
        else return 0;
    }
}
