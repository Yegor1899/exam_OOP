package tests.by.bntu.fitr.povt.exam.test7;

import by.bntu.fitr.povt.exam.task7.Seven;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test7 {
    @Test
    public void test1() {
        int n = 4;
        String result = "spring";
        assertEquals(result, Seven.logic(n));
    }
    @Test
    public void test2() {
        int n = 6;
        String result = "spring";
        assertEquals(result, Seven.logic(n));
    }

}
