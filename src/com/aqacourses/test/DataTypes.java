package com.aqacourses.test;

public class DataTypes {

    public static void main(String[] args) {   //psvm

        boolean varBoolean = false;
        char varChar = '\u266B';
        byte varByte = 125;
        short varShort = 23423;
        int varInt = 24234234;
        long varLong = 234234234234l;
        float varFloat = 23.4f;
        double varDouble = 45.6;

        String varString = "This is a test string";


        System.err.println(); // serr

        varInt = varByte;
        varShort = (short) varInt;

        System.out.println(varShort); //sout

    }

}
