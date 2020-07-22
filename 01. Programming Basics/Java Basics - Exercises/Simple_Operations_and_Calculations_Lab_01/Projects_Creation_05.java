package Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class Projects_Creation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String archName = scanner.nextLine();
        int projCount = Integer.parseInt(scanner.nextLine());

        System.out.println("The architect " + archName + " will need " + (3 * projCount) +
            " hours to complete " + projCount + " project/s."    );
    }
}
