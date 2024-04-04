package org.muxun.algorithm.leetcode.java.sort;

/**
 * 最小堆排序
 * @author 慕勋
 * @date 2019-08-28
 */
public class MinHeapSort {

    private final int[] heap;
    private int size;
    private final int capacity;

    public MinHeapSort(int maxSize) {
        this.heap = new int[maxSize + 1];
        this.size = 0;
        this.capacity = maxSize;
    }

    /**
     * 向堆中插入元素
     * @param entry 待插入元素
     */
    public void insert(int entry) {
        heap[this.size + 1] = entry;
        size++;
        this.swim(size);
    }

    /**
     * 删除元素
     * @return 被删除元素
     */
    public int delete() {
        int deleted = heap[1];
        heap[1] = heap[size];
        size--;
        this.sink(1);
        return deleted;
    }

    /**
     * 上浮元素
     * @param index 上浮元素索引位置
     */
    private void swim(int index) {
        if (index <= 1) {
            return;
        }
        while (heap[index] < heap[index / 2]) {
            int temp = heap[index];
            heap[index] = heap[index / 2];
            heap[index / 2] = temp;
        }
    }

    /**
     * 下沉
     * @param index 待下沉的元素
     */
    private void sink(int index) {
        while (index * 2 <= size) {
            int j = index * 2;
            if (j + 1 <= size && heap[j] > heap[j + 1]) {
                j++;
            }
            // 小于两个子节点，暂时不需要调整
            if (heap[index] < heap[j]) {
                break;
            }
            int temp = heap[index];
            heap[index] = heap[j];
            heap[j] = temp;
            index++;
        }
    }
}
