package com.mebg.mi;

import com.mebg.Operations;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class OperationTest {


    private static Operations operations;


    @BeforeAll

    public static void setupAll(){

        Operations operations = new Operations();

    }
    @Test
    public static  void testAddOperation() {
        /*Operations operations = new Operations();*/
        assertEquals(13, operations.add(10,3));
        assertEquals(10, operations.add(1,9));
        assertNotEquals(10,operations.add(10,4));
    }

    @Test

    public static void testRestOperation() {

        assertEquals(-4, operations.rest(10,14));
        assertEquals(10, operations.rest(110,100));

    }


}
