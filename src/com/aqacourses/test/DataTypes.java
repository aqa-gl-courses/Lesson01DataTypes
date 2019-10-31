package com.aqacourses.test;

public class DataTypes {

    public static void main(String[] args) {
        boolean varBoolean = true;
        char varChar = '\u266B';
        byte varByte = 25;
        short varShort = 2345;
        int varInt = 234223425;
        long varLong = 2342323232423434L;
        float varFloat = 24.67f;
        double varDouble = 234234.4523;

        System.out.println(varBoolean);
        System.out.println(varChar);
        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(varFloat);
        System.out.println(varDouble);

        varShort = (short) varInt;
        System.err.println(varShort);

        String testString = "test";

        System.err.println();




    }

}
