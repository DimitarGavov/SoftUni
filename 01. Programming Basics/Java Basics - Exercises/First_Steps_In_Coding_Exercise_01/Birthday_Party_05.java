package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Birthday_Party_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double animator = rent / 3;

        double result = rent + cake + drinks + animator;

        System.out.println(result);

    }
}
