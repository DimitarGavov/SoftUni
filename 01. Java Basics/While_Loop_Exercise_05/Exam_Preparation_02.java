package While_Loop_Exercise_05;

import java.util.Scanner;

public class Exam_Preparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bad_degrees = Integer.parseInt(scanner.nextLine()); // брой лоши оценки
        int count_bad_degrees = 0;  // направени лоши оценки

        String name = scanner.nextLine();
        int sum_degrees = 0;
        int count_degrees = 0;
        String last_name = "";

        while (!(name.equals("Enough"))) {
            last_name = name;
            int degree = Integer.parseInt(scanner.nextLine());
            if (degree <= 4) {
                count_bad_degrees++;
            }
            sum_degrees += degree;
            count_degrees++;
            if (count_bad_degrees == bad_degrees) {
                System.out.printf("You need a break, %d poor grades.", bad_degrees);
                break;
            }
            name = scanner.nextLine();
        }

        if (count_bad_degrees != bad_degrees) {
            System.out.printf("Average score: %.2f%n", sum_degrees * 1.0 / count_degrees);
            System.out.printf("Number of problems: %d%n", count_degrees);
            System.out.printf("Last problem: %s", last_name);
        }
    }
}
