package com.nitron.kokobanana;

public class Main {


    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};

        System.out.println(calculate(piles, 5));

    }

    private static int calculate(int[] piles, int hours) {

        int speed = 1;
        while (true) {
            int timespent = 0;
            for (int pile : piles) {
                timespent += (int) Math.ceil((double) pile / speed);
                if (timespent > hours) {
                    break;
                }
            }
            System.out.println("TIMESPENT" + timespent);

            if (timespent <= hours)
                return speed;
            else speed += 1;


        }
    }


}
