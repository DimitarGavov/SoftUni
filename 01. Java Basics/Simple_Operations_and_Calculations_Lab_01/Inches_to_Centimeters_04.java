package Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class Inches_to_Centimeters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());

        System.out.println(price * 2.54);

    }
}
