package tests.by.bntu.fitr.povt.exam.test1;

import by.bntu.fitr.povt.exam.task1.First;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void test1(){
        int a = 2;
        int b = 4;
        int c = 5;
        int result = 5;
        assertEquals(result, First.logic(a,b,c));
    }
    @Test
    public void test2(){
        int a = 5;
        int b = 5;
        int c = 5;
        int result = 5;
        assertEquals(result, First.logic(a,b,c));
    }
    @Test
    public void test3(){
        int a = -1;
        int b = 4;
        int c = 5;
        int result = 4;
        assertEquals(result, First.logic(a,b,c));
    }
}
