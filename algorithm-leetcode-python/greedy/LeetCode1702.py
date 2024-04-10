class LeetCode1702(object):
    def maximumBinaryString(self, binary: str) -> str:
        index = binary.find('0')
        if index < 0:
            return binary
        count = binary.count('1', index)
        return '1' * (len(binary) - count - 1) + '0' + '1' * count
