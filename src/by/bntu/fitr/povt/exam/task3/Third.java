package by.bntu.fitr.povt.exam.task3;

public class Third {
    public static void test(int n){
        System.out.print(n);
        System.out.print(' ');
        if (n < 10){
            n++;
            test(n);
        }
    }

}
