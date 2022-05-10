package com.nitron.binaryTreeDiameter;

import com.nitron.binarytree.Tree;
import com.nitron.binarytree.TreeGenerator;
import com.nitron.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        TreeGenerator treeGenerator = new TreeGenerator();
        var list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(1);

        Tree tree = treeGenerator.generateTree(list);
      // Tree tree =  treeGenerator.generateTree(random.ints(10, 100, 200).boxed().collect(Collectors.toList()));
        treeGenerator.traverse(tree.getRootNode());
        var binTreeCalc = new BinTreeDiameterCalc();
        binTreeCalc.calcBTDiameter(tree.getRootNode());
        System.out.println(binTreeCalc.getResult());
    }
}
