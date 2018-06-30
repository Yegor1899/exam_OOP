package by.bntu.fitr.povt.exam.task5;
import java.util.Scanner;

public class Fives {
    public static void test() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(logic(a,b,c)){
            System.out.println("It's triangle");
        }
        else {
            System.out.println("It's not triangle");
        }
    }
    public static boolean logic(int a, int b, int c){
        boolean triangle=false;
        if(a+b>c){
            if(a+c>b){
                if(b+c>a) {
                    triangle=true;
                }
                else triangle=false;
            }
            else triangle= false;

        }
        else triangle=false;
        return triangle;
    }
}