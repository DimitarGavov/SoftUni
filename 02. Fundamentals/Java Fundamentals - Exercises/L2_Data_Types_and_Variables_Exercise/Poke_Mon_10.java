package Data_Types_and_Variables_Exercise_02;

import java.util.Scanner;

public class Poke_Mon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int poked = 0;

        int middle = n / 2;

        while (n >= m) {
            n -= m;
            poked++;
            if (n == middle && y != 0) {
                n /= y;
            }
        }

        System.out.println(n);
        System.out.println(poked);
    }
}
