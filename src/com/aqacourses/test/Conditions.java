package com.aqacourses.test;

public class Conditions {

    public static void main(String[] args) {

        int test = 5;

        if (test == 6 || test == 5) {
            System.out.println("True");
        } else if (test == 5) {
            System.out.println("Also true");
        } else {
            System.err.println("False");
        }

        switch (test) {

            case 6:
                System.out.println("True");
                break;

            case 5:
                System.out.println("Also true");
                break;

            default:
                System.err.println("False");
                break;

        }

    }

}
