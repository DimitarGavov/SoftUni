package Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class Greeting_by_Name_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
