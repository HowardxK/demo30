package com.example.demo30;

import org.junit.jupiter.api.*;

public class MyTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("執行 @BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("執行 @AfterAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("執行 @BeforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("執行 @AfterEach");
    }

    @Test
    public void test1() {
        System.out.println("執行 test1");
    }

    @Test
    public void test2() {
        System.out.println("執行 test2");
    }
}
