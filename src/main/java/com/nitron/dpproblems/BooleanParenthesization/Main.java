package com.nitron.dpproblems.BooleanParenthesization;

public class Main {

    public static void main(String[] args) {

        //String expr = "T&F^T|F";
        String expr = "T|F^F&T|F^F^F^T|T&T^T|F^T^F&F^T|T^F";

        System.out.println(new BooleanParenthesizer().calcWaysToParenthesize(expr));

    }
}
