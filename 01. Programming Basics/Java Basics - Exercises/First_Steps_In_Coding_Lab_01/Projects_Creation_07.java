package First_Steps_In_Coding_Lab_01;

import java.util.Scanner;

public class Projects_Creation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int project_count = Integer.parseInt(scanner.nextLine());

        System.out.println("The architect " + name + " will need " + project_count * 3 + " hours to complete " +
                project_count + " project/s.");
    }
}
