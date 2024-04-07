package org.muxun.algorithm.leetcode.java.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024-04-07
 */
@DisplayName("王伟继承顺序测试用例")
public class LeetCode1600Test {

    @Test
    public void testOne() {
        List<String> expected1 = List.of("king", "andy", "matthew", "bob", "alex", "asha", "catherine");
        List<String> expected2 = List.of("king", "andy", "matthew", "alex", "asha", "catherine");
        LeetCode1600 throneInheritance = new LeetCode1600("king");
        throneInheritance.birth("king", "andy");
        throneInheritance.birth("king", "bob");
        throneInheritance.birth("king", "catherine");
        throneInheritance.birth("andy", "matthew");
        throneInheritance.birth("bob", "alex");
        throneInheritance.birth("bob", "asha");
        List<String> res1 = throneInheritance.getInheritanceOrder();
        throneInheritance.death("bob");
        List<String> res2 = throneInheritance.getInheritanceOrder();
        Assertions.assertIterableEquals(expected1, res1);
        Assertions.assertIterableEquals(expected2, res2);
    }
}
