package com.example.helloworld;

public class HelloWorld {

    static final double PINUM = 3.141529;
    static String randomString = "String to Print";
    public static void main(String[] args) {
        System.out.println(randomString);
        System.out.println(PINUM);
        int integerOne = 22;
        int integerTwo = integerOne + 1;
        System.out.println(integerTwo);
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 210000000;
        long bigLong = 920000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.14823;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 65;
        char anotherChar = 'A';
        System.out.println(randomChar);
        char escapedChars = '\\';

        String stuff = "stuff";
        String addStrings = randomString + stuff;
        System.out.println(addStrings);
        String byteString = Byte.toString(bigByte);

        double aDoubleValue = 3.1444545;
        int doubleToInt = (int) aDoubleValue;


    }
}
