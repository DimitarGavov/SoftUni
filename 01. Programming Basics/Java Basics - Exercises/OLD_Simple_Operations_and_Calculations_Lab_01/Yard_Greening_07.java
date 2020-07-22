package OLD_Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class Yard_Greening_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double greenYard = Double.parseDouble(scanner.nextLine());

        System.out.printf("The final price is: %.2f lv.", (greenYard * 7.61) * 0.82);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", (greenYard * 7.61) * 0.18);
    }
}
