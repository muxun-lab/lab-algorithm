package org.muxun.algorithm.leetcode.java.sort;

/**
 * 最大堆排序(O(logN))
 * @author 慕勋
 * @date 2019-08-28
 */
public class MaxHeapSort {

    private final int[] heap;
    private int size;
    private final int capacity;

    public MaxHeapSort(int maxSize) {
        this.heap = new int[maxSize + 1];
        this.size = 0;
        this.capacity = maxSize;
    }

    /**
     * 插入元素，先将元素放入到数组中的最后一个位置，也就是堆的最后一个位置
     * 然后再进行上移和下沉
     */
    public void insert(int entry) {
        heap[this.size + 1] = entry;
        size++;
        this.swim(size);
    }

    /**
     * 上移
     * @param index 待移动元素索引
     */
    public void swim(int index) {
        if (index < 1) {
            return;
        }
        while (heap[index] > heap[index / 2]) {
            int temp = heap[index];
            heap[index] = heap[index / 2];
            index = index / 2;
        }
    }

    /**
     * 下沉
     * @param index 待移动元素游标
     */
    public void sink(int index) {
        while (2 * index <= size) {
            int j = index * 2;
            // 指向子节点中较大的那一个
            if (j + 1 <= size && heap[j] < heap[j + 1]) {
                j++;
            }
            // 已经是最大的了
            if (heap[index] > heap[j]) {
                break;
            }
            // 元素下沉
            int temp = heap[index];
            heap[index] = heap[j];
            heap[j] = temp;
            // 游标赋值
            index = j;
        }
    }

    /**
     * 堆删除元素只能删除堆顶元素
     * 然后把堆中最后一个元素瞬移到堆顶，再进行下沉操作
     * @return 删除元素
     */
    public int delete() {
        int deleted = heap[1];
        heap[1] = heap[size];
        size--;
        this.sink(1);
        return deleted;
    }
}
