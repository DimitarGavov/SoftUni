package While_Loop_Exercise_05;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int done_steps = 0;

        while (!(done_steps >= goal)) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                done_steps += Integer.parseInt(scanner.nextLine());
                break;
            } else {
                done_steps += Integer.parseInt(input);
            }
        }

        if (done_steps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", done_steps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - done_steps);
        }
    }
}
