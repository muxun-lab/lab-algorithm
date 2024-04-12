import unittest

from src.array.LeetCode2923 import LeetCode2923


class MyTestCase(unittest.TestCase):
    def test_one(self):
        grid = [[0, 1], [0, 0]]
        expected = 0
        res = LeetCode2923().findChampion(grid)
        self.assertEqual(expected, res)

    def test_two(self):
        grid = [[0, 0, 1], [1, 0, 1], [0, 0, 0]]
        expected = 1
        res = LeetCode2923().findChampion(grid)
        self.assertEqual(expected, res)
