package com.nitron.binarytree;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        TreeGenerator treeGenerator = new TreeGenerator();
        var list = new ArrayList<Integer>();
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(11);
        list.add(12);
        list.add(7);
        list.add(10);
        treeGenerator.generateTree(list);
        Random random = new Random();
       // treeGenerator.generateTree(random.ints(15, 100, 200).boxed().collect(Collectors.toList()));
    }

}
