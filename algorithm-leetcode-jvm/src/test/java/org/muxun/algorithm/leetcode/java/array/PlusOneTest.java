package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author 慕勋
 * @date 2020/1/20
 */
@DisplayName("加一测试类")
public class PlusOneTest {

    @Test
    public void plusOneTestOne() {
        Arrays.stream(new PlusOne().plusOne(new int[]{1, 2, 3})).forEach(System.out::println);
    }

    @Test
    public void plusOneTestTwo() {
        Arrays.stream(new PlusOne().plusOne(new int[]{4, 3, 2, 1})).forEach(System.out::println);
    }

    @Test
    public void plusOneTestThree() {
        Arrays.stream(new PlusOne().plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})).forEach(System.out::println);
    }

    @Test
    public void plusOneTestFour() {
        Arrays.stream(new PlusOne().plusOne(new int[]{4, 9})).forEach(System.out::println);
    }

    @Test
    public void plusOneTestFive() {
        Arrays.stream(new PlusOne().plusOne(new int[]{9, 9})).forEach(System.out::println);
    }

    @Test
    public void plusOneTestSix() {
        Arrays.stream(new PlusOne().plusOne(new int[]{4, 9, 9})).forEach(System.out::println);
    }

    @Test
    public void plusOneTestSeven() {
        Arrays.stream(new PlusOne().plusOne(new int[]{9})).forEach(System.out::println);
    }
}
