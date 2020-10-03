package Arrays_Exercise_03;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTrains = Integer.parseInt(scanner.nextLine());
        int[] peopleInTrains = new int[numberOfTrains];
        int sum = 0;

        for (int i = 0; i < numberOfTrains; i++) {
            peopleInTrains[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < peopleInTrains.length; i++) {
            sum += peopleInTrains[i];
            System.out.print(peopleInTrains[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
