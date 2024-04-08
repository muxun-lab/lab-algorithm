import unittest

from src.array.LeetCode2529 import LeetCode2529


class LeetCode2529Test(unittest.TestCase):
    def test_one(self):
        nums = [-2, -1, -1, 1, 2, 3]
        expected = 3
        res = LeetCode2529().maximumCount(nums)
        self.assertEqual(expected, res)

    def test_two(self):
        nums = [-3, -2, -1, 0, 0, 1, 2]
        expected = 3
        res = LeetCode2529().maximumCount(nums)
        self.assertEqual(expected, res)

    def test_three(self):
        nums = [5, 20, 66, 1314]
        expected = 4
        res = LeetCode2529().maximumCount(nums)
        self.assertEqual(expected, res)
