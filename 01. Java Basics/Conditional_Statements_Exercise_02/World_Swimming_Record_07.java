package Conditional_Statements_Exercise_02;

import java.util.Scanner;

public class World_Swimming_Record_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record_sec = Double.parseDouble(scanner.nextLine());
        double distance_m = Double.parseDouble(scanner.nextLine());
        double time_sec_per_m = Double.parseDouble(scanner.nextLine());

        double time_distance = distance_m * time_sec_per_m;
        double slow_water = (distance_m / 15) * 12.5;
        double total_time = time_distance + slow_water;

        if (record_sec - total_time > 0) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total_time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", total_time - record_sec);
        }
    }
}
