package org.muxun.algorithm.leetcode.competition.week.week.onehundredeightyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredeightyone.CreateTargetArray;

/**
 * @author sunshine
 * @created 2020-03-22
 */
@DisplayName("按既定数组顺序创建目标数组单元测试")
public class CreateTargetArrayTest {

    @Test
    public void createTargetArrayTestOne() {
        Assertions.assertArrayEquals(new int[]{0, 4, 1, 3, 2}, new CreateTargetArray().createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
    }

    @Test
    public void createTargetArrayTestTwo() {
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, new CreateTargetArray().createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}));
    }

    @Test
    public void createTargetArrayTestThree() {
        Assertions.assertArrayEquals(new int[]{1}, new CreateTargetArray().createTargetArray(new int[]{1}, new int[]{0}));
    }
}
