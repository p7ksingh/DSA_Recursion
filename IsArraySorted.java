package com.arr.recursion;

public class IsArraySorted {
    public static boolean isShorted(int[] a) {
        // base case
        if (a.length == 1) {
            return true;
        }
        // hypothical induction case
        // assume this is true for every element
        if (a[0] > a[1]) {
            return false;
        }
        int smallArray[] = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            smallArray[i - 1] = a[i];

        }
        boolean isSmallArraysSorted = isShorted(smallArray);
        return isSmallArraysSorted;
    }

    public static void main(String[] args) {
        int[] a = { 1, 9, 3, 4, 5, 6 };
        System.out.println(isShorted(a));
    }
}
