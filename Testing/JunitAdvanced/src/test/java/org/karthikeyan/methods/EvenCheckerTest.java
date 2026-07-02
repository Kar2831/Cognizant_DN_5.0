package org.karthikeyan.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {

    EvenChecker evenChecker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    public void isEven(int number){
        assertTrue(evenChecker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9})
    public void returnFalseOnOdd(int number){
        assertFalse(evenChecker.isEven(number));
    }

}
