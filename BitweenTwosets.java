/*
There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

Example
a = [2,6]
b = [16,32,96]

result is 3 

lcm of a ;
and gcd of b ;
count of factor from lcm to gcd ;


 */

import java.util.ArrayList;
import java.util.List;

public class BitweenTwosets {
    public static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }

    public static int getLCM(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        } else {
            int gcd = getGCD(n1, n2);
            return Math.abs(n1 * n2) / gcd;

        }
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;
        int lcm = a.get(0);
        for (Integer integer : a) {
            lcm = getLCM(lcm, integer);
        }
        int gcd = b.get(0);
        for (Integer integer : b) {
            gcd = getGCD(gcd, integer);
        }

        int multiple = 0;
        while (multiple <= gcd) {
            multiple += lcm;

            if (gcd % multiple == 0)
                result++;
        }

        return result;

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(4);
        b.add(16);
        b.add(32);
        b.add(96);

        System.out.println(getTotalX(a, b));

    }
}
