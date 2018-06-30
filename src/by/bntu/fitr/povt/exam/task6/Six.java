package by.bntu.fitr.povt.exam.task6;

import java.util.Scanner;

public class Six {
    public static void test() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Max number : " + logic(a,b,c));
    }
    public static int logic(int a, int b, int c){

        if(a>=b&&a>=c){
            return a;
        }
        else if(b>=c&&b>=a){
            return b;
        }
        else if(c>=b&&c>=a){
            return c;
        }
        return 0;
    }
}

