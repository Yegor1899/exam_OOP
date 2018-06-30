package tests.by.bntu.fitr.povt.exam.test8;

import by.bntu.fitr.povt.exam.task8.Eight;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test8 {

    @Test
    public void test1() {
        int a = 5;
        int result = 5;
       assertEquals(result, Eight.logic(a));
    }
    @Test
    public void test2() {
        int a = 4;
        int result = 2;
        assertEquals(result, Eight.logic(a));
    }
    @Test
    public void test3() {
        int a = -11;
        int result = 0;
        assertEquals(result, Eight.logic(a));
    }
}