import unittest

from src.array.LeetCode2009 import LeetCode2009


class LeetCode2009Test(unittest.TestCase):
    def test_one(self):
        nums = [4, 2, 5, 3]
        expected = 0
        res = LeetCode2009().minOperations(nums)
        self.assertEqual(expected, res)

    def test_two(self):
        nums = [1, 2, 3, 5, 6]
        expected = 1
        res = LeetCode2009().minOperations(nums)
        self.assertEqual(expected, res)

    def test_three(self):
        nums = [1, 10, 100, 1000]
        expected = 3
        res = LeetCode2009().minOperations(nums)
        self.assertEqual(expected, res)
