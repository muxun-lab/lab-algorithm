package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-10
 */
@DisplayName("最大连续1个数测试类")
public class FindMaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnesTestOne() {
        Assertions.assertEquals(3, new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
