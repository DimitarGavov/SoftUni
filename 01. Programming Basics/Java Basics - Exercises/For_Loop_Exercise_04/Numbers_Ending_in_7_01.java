package For_Loop_Exercise_04;

import java.util.Scanner;

public class Numbers_Ending_in_7_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
