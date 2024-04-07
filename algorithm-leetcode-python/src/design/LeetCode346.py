from collections import deque


class LeetCode346(object):
    def __init__(self, size: int):
        self.size = size
        self.sum = 0
        self.queue = deque()

    def next(self, val: int) -> float:
        if len(self.queue) == self.size:
            self.sum -= self.queue.popleft()
        self.sum += val
        self.queue.append(val)
        return self.sum / len(self.queue)
