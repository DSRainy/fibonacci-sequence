/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.rwl.test.training.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thanthathon
 */
public class AlgorithmTest {

    public AlgorithmTest() {
    }

    @Test
    public void fibonacci() {
        int[] testSeq = {1,1,2,3,5,8,13,21};
//        assertEquals(13, Fibonacci.fibonacci(7));
//        assertEquals(8, Fibonacci.fibonacci(6));
        assertArrayEquals(testSeq, Fibonacci.getFibonacciSequence(8));
    }
}
