package org.karthikeyan.methods;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
//    @DisplayName("A")
    public void test1(){
        assertTrue(true);
    }

    @Test
//    @DisplayName("B")
    @Order(2)
    public void test2(){
        assertTrue(true);
    }

    @Test
//    @DisplayName("C")
    @Order(3)
    public void test3(){
        assertTrue(true);
    }

    @Test
    @Order(4)
//    @DisplayName("D")
    public void test4(){
        assertTrue(true);
    }

    @Test
    @Order(5)
//    @DisplayName("E")
    public void test5(){
        assertTrue(true);
    }

}
