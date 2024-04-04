package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-29
 */
@DisplayName("数组中的K-diff对测试类")
public class FindKDiffPairsTest {

    @Test
    public void findKDiffPairsTestOne() {
        Assertions.assertEquals(2, new FindKDiffPairs().findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    public void findKDiffPairsTestTwo() {
        Assertions.assertEquals(4, new FindKDiffPairs().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void findKDiffPairsTestThree() {
        Assertions.assertEquals(1, new FindKDiffPairs().findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    @Test
    public void findKDiffPairsTestFour() {
        Assertions.assertEquals(2, new FindKDiffPairs().findPairsUpgrade(new int[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    public void findKDiffPairsTestFive() {
        Assertions.assertEquals(4, new FindKDiffPairs().findPairsUpgrade(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void findKDiffPairsTestSix() {
        Assertions.assertEquals(1, new FindKDiffPairs().findPairsUpgrade(new int[]{1, 3, 1, 5, 4}, 0));
    }
}
