package While_Loop_Lab_05;

import java.util.Scanner;

public class Graduation_pt_2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int count_strikes = 0;
        int count_class = 0;
        double grade;
        double sum_grade = 0;


        while (!(count_strikes == 2 || count_class == 12)) {
            grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                count_strikes++;
            } else {
                count_class++;
                sum_grade += grade;
            }
        }

        if (count_strikes == 2) {
            System.out.printf("%s has been excluded at %d grade", name, count_class + 1);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum_grade / count_class);
        }
    }
}
