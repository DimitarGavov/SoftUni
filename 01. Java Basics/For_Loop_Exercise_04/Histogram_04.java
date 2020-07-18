package For_Loop_Exercise_04;

import java.util.Scanner;

public class Histogram_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num =Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= num; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 1 && number<200) {
                p1 = p1+1;
            } else if (number >=200 && number < 400) {
                p2 += 1;
            } else if (number >= 400 && number < 600) {
                p3 += 1;
            } else if (number >= 600 && number < 800) {
                p4 += 1;
            } else if (number >= 800 && number <= 1000) {
                p5 += 1;
            }
        }

        int sum = p1+p2+p3+p4+p5;


        System.out.printf("%.2f%%%n", p1*1.0/sum*100);
        System.out.printf("%.2f%%%n", p2*1.0/sum*100);
        System.out.printf("%.2f%%%n", p3*1.0/sum*100);
        System.out.printf("%.2f%%%n", p4*1.0/sum*100);
        System.out.printf("%.2f%%%n", p5*1.0/sum*100);
    }
}
