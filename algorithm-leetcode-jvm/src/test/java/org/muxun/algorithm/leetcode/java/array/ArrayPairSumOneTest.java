package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-29
 */
@DisplayName("数组拆分 I测试类")
public class ArrayPairSumOneTest {

    @Test
    public void arrayPairSumOneTestOne() {
        Assertions.assertEquals(4, new ArrayPairSumOne().arrayPairSum(new int[]{1, 4, 3, 2}));
    }
}
