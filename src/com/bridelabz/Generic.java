package com.bridelabz;

public class Generic {
    static <E extends Comparable<E>>
    void compare(E[] arrValue) {

        E maximum = arrValue[0];

        for (int i = 1; i < arrValue.length; i++) {

            int result = maximum.compareTo(arrValue[i]);

            if(result < 0) {
                maximum = arrValue[i];
            }
        }
        printMax(maximum);
    }

    public static <E> void printMax(E maximum) {

        System.out.println("The maximum value is " + maximum);
    }

}
