package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private MathUtils math;

    @Before
    public void setUp() {
        // Setup (called before each test)
        math = new MathUtils();
        System.out.println("Running setup...");
    }

    @After
    public void tearDown() {
        // Teardown (called after each test)
        System.out.println("Running teardown...\n");
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = math.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = math.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
}
