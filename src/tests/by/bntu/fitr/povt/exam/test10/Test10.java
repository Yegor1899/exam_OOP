package tests.by.bntu.fitr.povt.exam.test10;

import by.bntu.fitr.povt.exam.task10.Ten;
import org.junit.Test;

import static org.junit.Assert.*;


public class Test10 {
    @Test
    public void test1(){
        int[] arr= {1,2,3,4,5};
        int[] array = {5,3,2,1,4};
        assertArrayEquals(arr,Ten.sort(array));
    }

    @Test
    public void test2(){
        int[] arr= {-1,0,0,-1};
        int[] array = {-1,-1,0,0};
        assertArrayEquals(array,Ten.sort(arr));
    }
}

