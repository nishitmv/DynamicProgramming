package com.nitron.binaryTreeMaxPathSumLeaftoLeaf;

import com.nitron.binaryTreeMaxPathSum.BTMaxPathSumCalc;
import com.nitron.binarytree.Tree;
import com.nitron.binarytree.TreeGenerator;

import java.util.ArrayList;
import java.util.Random;

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
        var maxPathSumCal = new BTMaxPathLeafSumCalc();
        maxPathSumCal.calcBTMaxPathSumLeaf(tree.getRootNode());
        System.out.println(maxPathSumCal.getResult());
    }
}