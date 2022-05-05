package com.nitron.BooleanParenthesization;

public class Main {

    public static void main(String[] args) {

        String expr = "T&F^T|F";

        System.out.println(new BooleanParenthesizer().calcWaysToParenthesize(expr));

    }
}
