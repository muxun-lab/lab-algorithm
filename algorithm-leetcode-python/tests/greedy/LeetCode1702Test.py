import unittest

from greedy.LeetCode1702 import LeetCode1702


class LeetCode1702Test(unittest.TestCase):
    def test_one(self):
        binary = '000110'
        expected = '111011'
        res = LeetCode1702().maximumBinaryString(binary)
        self.assertEqual(expected, res)

    def test_one(self):
        binary = '01'
        expected = '01'
        res = LeetCode1702().maximumBinaryString(binary)
        self.assertEqual(expected, res)
