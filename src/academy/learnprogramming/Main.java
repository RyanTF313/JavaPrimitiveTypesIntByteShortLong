package academy.learnprogramming;

import com.sun.jdi.LongValue;

public class Main {

    public static void main(String[] args) {
        // Int occupies 32 bits aka has a width of 32
	    int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Value = " + myValue);
        // smallest number in Java
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        // largest number in Java
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Underflow: When you try to make a value smaller then the minimum value
        System.out.println("Integer Minimum Value - 1 = " + (myMinIntValue - 1));
        // Overflow: When you try to make a value larger then the maximum value
        System.out.println("Integer Maximum Value + 1 = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);
        // Byte occupies 8 bits aka has a width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        // Short occupies 16 bits aka has a width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        // Long occupies 64 bits aka has a width of 64
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Value = " + myLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long myLongTest = 2_147_483_647;
        System.out.println(myLongTest + 1);

        int myTotal = (myMinIntValue / 2);

        // byte myNewByteValue = (myMinByteValue / 2); causes an error because it sees it as an integer. We have to use casting(number converting) to make sure it is a byte.
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        // short myNewShortvalue = (myMinShortValue / 2); causes the same error
        short myNewShortvalue = (short) (myMinShortValue / 2);

        // Challenge code:

        // Create a valid byte variable
        byte byteOutOfCrime = 101;

        // Create a valid short variable
        short howShort = 30_000;

        // Create a valid int variable
        int oneIsTheLoneliest = 111_111_111;

        // Create a valid long variable that is equal to 50_000 + 10 times the sum of the byte, short, and int values.
        long howLongIsIt_Pause = (50_000 + (10 * (byteOutOfCrime + howShort + oneIsTheLoneliest)));

        System.out.println(byteOutOfCrime);
        System.out.println(howShort);
        System.out.println(oneIsTheLoneliest);
        System.out.println(howLongIsIt_Pause);
    }
}
