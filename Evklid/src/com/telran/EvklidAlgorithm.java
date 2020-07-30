package com.telran;

public class EvklidAlgorithm {



    public static int gcd(int a, int b) {

        if (b > a) {
            if ((b % a) == 0)
                return a;
            else
                return gcd(a, b % a);
        }
        else {
            if ((a % b) == 0)
                return b;
            else
                return gcd(b, a % b);
        }
    }
}
