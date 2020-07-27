package Data_Types_and_Variables_Lab_02;

import java.util.Scanner;

public class Pounds_to_Dollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%.3f", Double.parseDouble(scanner.nextLine()) * 1.31);
    }
}
