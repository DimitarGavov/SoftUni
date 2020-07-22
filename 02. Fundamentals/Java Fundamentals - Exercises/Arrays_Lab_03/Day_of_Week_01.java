package Arrays_Lab_03;

import java.util.Scanner;

public class Day_of_Week_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        switch (dayNumber) {
            case 1:
                System.out.println(weekDays[0]);
                break;
            case 2:
                System.out.println(weekDays[1]);
                break;
            case 3:
                System.out.println(weekDays[2]);
                break;
            case 4:
                System.out.println(weekDays[3]);
                break;
            case 5:
                System.out.println(weekDays[4]);
                break;
            case 6:
                System.out.println(weekDays[5]);
                break;
            case 7:
                System.out.println(weekDays[6]);
                break;
             default:
                 System.out.println("Invalid day!");
                 break;
        }
    }
}
