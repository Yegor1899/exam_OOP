package tests.by.bntu.fitr.povt.exam.test6;

import by.bntu.fitr.povt.exam.task6.Six;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test6 {
    @Test
    public void test1(){
        int a = 4;
        int b =3;
        int c = -9;
        int result = 4;
        assertEquals(result, Six.logic(a,b,c));
    }
    @Test
    public void test2(){
        int a = 4;
        int b =3;
        int c = -9;
        int result = -9;
        assertEquals(result, Six.logic(a,b,c));
    }
    @Test
    public void test3(){
        int a = 4;
        int b =4;
        int c = 4;
        int result = 4;
        assertEquals(result, Six.logic(a,b,c));
    }
}
