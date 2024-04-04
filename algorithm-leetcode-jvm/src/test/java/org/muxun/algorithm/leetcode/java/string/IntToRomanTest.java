package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-12
 */
@DisplayName("整数转罗马数字")
public class IntToRomanTest {

    @Test
    public void intToRomanTestOne() {
        Assertions.assertEquals("III", new IntToRoman().intToRoman(3));
    }

    @Test
    public void intToRomanTestTwo() {
        Assertions.assertEquals("IV", new IntToRoman().intToRoman(4));
    }

    @Test
    public void intToRomanTestThree() {
        Assertions.assertEquals("IX", new IntToRoman().intToRoman(9));
    }

    @Test
    public void intToRomanTestFour() {
        Assertions.assertEquals("LVIII", new IntToRoman().intToRoman(58));
    }

    @Test
    public void intToRomanTestFive() {
        Assertions.assertEquals("MCMXCIV", new IntToRoman().intToRoman(1994));
    }

    @Test
    public void intToRomanTestSix() {
        Assertions.assertEquals("MDCLXVI", new IntToRoman().intToRoman(1666));
    }
}
