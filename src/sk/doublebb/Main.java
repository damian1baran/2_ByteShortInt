package sk.doublebb;

public class Main {

    public static void main(String[] args) {

        // byte has a width of 8 bits
        byte myMaxByteValue = 127;
        byte myMinByteValue = -128;

        // short has a width of 16 bits
        short myMaxShortValue = 32767;
        short myMinShortValue = -32768;

        // int has a width of 32 bits
        int myMaxIntValue = 2_147_483_647;
        int myMinIntValue = -2_147_483_648;

        // long has a width of 64
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        long myMinLongValue = -9_223_372_036_854_775_808L;


        // Some Basic Arithmetic and Tips

        /*
        byte myByteTotal = (myMinByteValue / 2);

        Incorrect expression because Java automatically convert expressions to
        int therefore we need to cast it to expected data type. In this case byte.
        */

        // Correct expression with cast
        byte myByteTotal = (byte) (myMinByteValue / 2);
        short myShortTotal = (short) (myMinShortValue / 2);
        // We doesn't need to cast int as Java uses int automatically for expressions
        int myIntTotal = (myMinIntValue / 2);


        System.out.println(myMaxByteValue);
        System.out.println(myMinByteValue);
        System.out.println(myMaxShortValue);
        System.out.println(myMinShortValue);
        System.out.println(myMaxIntValue);
        System.out.println(myMinIntValue);
        System.out.println(myMaxLongValue);
        System.out.println(myMinLongValue);

        System.out.println(myByteTotal);
        System.out.println(myShortTotal);
        System.out.println(myIntTotal);


        // Problem set from Tim
        byte psetByte = 10;
        short psetShort = 20;
        int psetInt = 50;
        long psetLong = 50000 + 10 * (psetByte + psetShort + psetInt);

        System.out.println(psetLong);

    }
}
