package For_Loop_Lab_04;

import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter even number:");
        int number = Integer.parseInt(scanner.nextLine());

        while (number % 2 != 0) {
            System.out.println("The number is not even.");
            System.out.print("Enter even number:");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Even number entered: " + number);
    }
}
