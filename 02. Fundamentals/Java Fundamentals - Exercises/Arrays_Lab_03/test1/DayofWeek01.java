package Arrays_Lab_03.test1;

import java.util.Scanner;

public class DayofWeek01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day_number = Integer.parseInt(scanner.nextLine());
        String[] week_days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day_number < 1 || day_number > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(week_days[day_number - 1]);
        }
    }
}
