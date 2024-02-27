package com.arr.recursion;

public class NatuealNumSum {
    public static int summ(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // hypothyse condation
        int smallOutput = summ(n - 1);
        int output = n + smallOutput;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(summ(10));
    }
}
