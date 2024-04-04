package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-01-29
 */
@DisplayName("存在重复元素测试类")
public class ContainsDuplicateTest {

    @Test
    public void containsDuplicateTestOne() {
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void containsDuplicateTestTwo() {
        Assertions.assertFalse(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void containsDuplicateTestFour() {
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
