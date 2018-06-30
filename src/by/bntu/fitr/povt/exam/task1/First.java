package by.bntu.fitr.povt.exam.task1;

import java.util.Scanner;

public class First {
    public static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Max number: "+logic(a, b,c));
    }

    public static int logic(int a, int b, int c){
        if  (a > b && a > c){
            return a;
        }
        else if  (b > c){
            return b;
        }
        return c;
    }
}
