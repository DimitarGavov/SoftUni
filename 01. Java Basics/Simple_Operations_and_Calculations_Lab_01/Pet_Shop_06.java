package Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class Pet_Shop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogCount = Integer.parseInt(scanner.nextLine());
        int animalsCount = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f lv.", (dogCount * 2.50) + (animalsCount * 4));
        System.out.println();
    }
}
