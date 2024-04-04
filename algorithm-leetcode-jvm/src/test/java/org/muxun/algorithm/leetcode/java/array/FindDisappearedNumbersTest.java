package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-02-10
 */
@DisplayName("找到所有数组中消失的数字测试类")
public class FindDisappearedNumbersTest {

    @Test
    public void findDisappearedNumbersTestOne() {
        Assertions.assertIterableEquals(List.of(5, 6), new FindDisappearedNumbers().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    public void findDisappearedNumbersTestTwo() {
        Assertions.assertIterableEquals(List.of(2), new FindDisappearedNumbers().findDisappearedNumbers(new int[]{1, 1}));
    }

    @Test
    public void findDisappearedNumbersTestThree() {
        Assertions.assertIterableEquals(List.of(1), new FindDisappearedNumbers().findDisappearedNumbers(new int[]{2, 2}));
    }

    @Test
    public void findDisappearedNumbersTestFour() {
        Assertions.assertIterableEquals(List.of(), new FindDisappearedNumbers().findDisappearedNumbers(new int[]{1, 2}));
    }

    @Test
    public void findDisappearedNumbersTestFive() {
        Assertions.assertIterableEquals(List.of(3, 4), new FindDisappearedNumbers().findDisappearedNumbers(new int[]{1, 1, 2, 2}));
    }

    @Test
    public void findDisappearedNumbersTestSix() {
        Assertions.assertIterableEquals(List.of(1, 2, 8), new FindDisappearedNumbers().findDisappearedNumbers(new int[]{5, 4, 6, 7, 9, 3, 10, 9, 5, 6}));
    }
}
