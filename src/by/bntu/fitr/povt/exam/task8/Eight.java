package by.bntu.fitr.povt.exam.task8;

import java.util.Scanner;

public class Eight {
    public static void test(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();
        System.out.println(logic(a));
    }

    public static int logic(int n){
        if (n == 0){
            return 0;
        }

        boolean bool = true;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++){
            if (bool){
                a = a + b;
                bool = false;
            }
            else{
                b = a + b;
                bool = true;
            }
        }

        if (bool){
            return a;
        }
        else{
            return b;
        }
    }
}
