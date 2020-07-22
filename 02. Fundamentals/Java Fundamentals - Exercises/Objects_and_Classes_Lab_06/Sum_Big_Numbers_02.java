package Objects_and_Classes_Lab_06;

import java.math.BigInteger;
import java.util.Scanner;

public class Sum_Big_Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();

        BigInteger sum = n.add(m);

        System.out.println(sum);
    }
}
