package tests.by.bntu.fitr.povt.exam.test9;

import by.bntu.fitr.povt.exam.task8.Eight;
import by.bntu.fitr.povt.exam.task9.Nines;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test9 {
    @Test
    public void test1() {
        int[] mass = {3, 4, 6};
        int a = 3;
        boolean result = true;
        assertEquals(result, Nines.logic(mass,a));
    }
    @Test
    public void test2() {
        int[] mass = {3, 4, 6};
        int a = 5;
        boolean result = false;
        assertEquals(result, Nines.logic(mass,a));
    }
    @Test
    public void test3() {
        int[] mass = {3, 4, 6};
        int a = 5;
        boolean result = true;
        assertEquals(result, Nines.logic(mass,a));
    }
}
