package by.bntu.fitr.povt.exam.task7;

import java.util.Scanner;

public class Seven {
    public static void test() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input number of month: ");
        int a = sc.nextInt();
        logic(a);
    }
    public static String logic(int a) {
        if (a <= 12 && a > 0) {
            if (a >= 1 && a <= 2 || a == 12) {
                return "winter";
            } else if (a >= 3 && a <= 5) {
                return "spring";
            } else if (a >= 6 && a <= 8) {
                return "summer";
            } else {
                return "autumn";
            }
        }
        return "";
    }
}

