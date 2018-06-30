package by.bntu.fitr.povt.exam.task9;

import java.util.Scanner;

public class Nines {
    public static void test() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();
        int arr[] = {1,5,7,22,-34,-4,0};
        System.out.println(logic(arr,a));

        }
    public static boolean logic(int []arr, int a){
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                return true;
            }

        }
        return false;
    }
}
