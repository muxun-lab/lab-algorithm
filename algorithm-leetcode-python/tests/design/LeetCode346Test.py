import unittest

from src.design.LeetCode346 import LeetCode346


class LeetCode346Test(unittest.TestCase):
    def test_one(self):
        expected1 = 1.0
        expected2 = 5.5
        expected3 = 4.666666666666667
        expected4 = 6.0
        moving_average = LeetCode346(3)
        res1 = moving_average.next(1)
        res2 = moving_average.next(10)
        res3 = moving_average.next(3)
        res4 = moving_average.next(5)
        self.assertEqual(expected1, res1)
        self.assertEqual(expected2, res2)
        self.assertEqual(expected3, res3)
        self.assertEqual(expected4, res4)
