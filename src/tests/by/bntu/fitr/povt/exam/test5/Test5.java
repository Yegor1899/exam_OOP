package tests.by.bntu.fitr.povt.exam.test5;

import by.bntu.fitr.povt.exam.task5.Fives;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test5 {
    @Test
    public void test1(){
        int a =4;
        int b = 4;
        int c =7;
        boolean result = true;
        assertEquals(result, Fives.logic(a,b,c));
    }
    @Test
    public void test2(){
        int a =4;
        int b = 4;
        int c =8;
        boolean result = false;
        assertEquals(result, Fives.logic(a,b,c));
    }
    @Test
    public void test3(){
        int a =4;
        int b = 4;
        int c =7;
        boolean result = false;
        assertEquals(result, Fives.logic(a,b,c));
    }
}
