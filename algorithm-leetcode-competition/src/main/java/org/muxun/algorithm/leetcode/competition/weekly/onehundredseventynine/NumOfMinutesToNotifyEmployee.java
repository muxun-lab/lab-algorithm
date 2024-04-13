package org.muxun.algorithm.leetcode.competition.weekly.onehundredseventynine;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：5354
 * 题目：通知所有员工所需的时间
 * 详情：公司里有 n 名员工，每个员工的 ID 都是独一无二的，编号从 0 到 n - 1
 * 公司的总负责人通过 headID 进行标识
 * <p>
 * 在 manager 数组中，每个员工都有一个直属负责人，其中 manager[i] 是第 i 名员工的直属负责人
 * <p>
 * 对于总负责人，manager[headID] = -1，题目保证从属关系可以用树结构显示
 * <p>
 * 公司总负责人想要向公司所有员工通告一条紧急消息，他将会首先通知他的直属下属们
 * 然后由这些下属通知他们的下属，直到所有的员工都得知这条紧急消息
 * <p>
 * 第 i 名员工需要 informTime[i] 分钟来通知它的所有直属下属（也就是说在 informTime[i] 分钟后，他的所有直属下属都可以开始传播这一消息）
 * 返回通知所有员工这一紧急消息所需要的 分钟数
 * <p>
 * 提示：
 * * 1 <= n <= 10^5
 * * 0 <= headID < n
 * * manager.length == n
 * * 0 <= manager[i] < n
 * * manager[headID] == -1
 * * informTime.length == n
 * * 0 <= informTime[i] <= 1000
 * * 如果员工 i 没有下属，informTime[i] == 0 。
 * * 题目 保证 所有员工都可以收到通知。
 * @author sunshine
 * @created 2020-03-08
 */
public class NumOfMinutesToNotifyEmployee {

    private int max;

    /**
     * 思路：递归
     * @param n          员工数量
     * @param headID     员工Leader ID
     * @param manager    员工数组
     * @param informTime 通知消耗时间
     * @return 通知消耗的最大时间
     */
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        if (n == 1) {
            return 0;
        }
        recursion(manager, informTime, headID, 0);
        return max;
    }

    public void recursion(int[] manager, int[] informTime, int headId, int current) {
        current = current + informTime[headId];
        for (int i = 0; i < manager.length; i++) {
            if (manager[i] == headId) {
                recursion(manager, informTime, i, current);
                max = Math.max(max, current);
            }
        }
    }

    /**
     * 自底向上进行遍历
     * @param n          员工数量
     * @param headID     员工Leader ID
     * @param manager    员工数组
     * @param informTime 通知消耗时间
     * @return 通知消耗的最大时间
     */
    public int numOfMinutesUpgrade(int n, int headID, int[] manager, int[] informTime) {
        for (int i = 0; i < n; i++) {
            if (informTime[i] != 0) {
                continue;
            }
            int currentIndex = i;
            int sum = 0;
            while (manager[currentIndex] != -1) {
                sum += informTime[manager[currentIndex]];
                currentIndex = manager[currentIndex];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    /**
     * DFS
     * @param n          员工数量
     * @param headID     员工Leader ID
     * @param manager    员工数组
     * @param informTime 通知消耗时间
     * @return 通知消耗的最大时间
     */
    public int numOfMinutesDFS(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            int head = manager[i];
            if (head == -1) {
                continue;
            }
            if (adj[head] == null) {
                adj[head] = new ArrayList<>();
            }
            adj[head].add(i);
        }
        dfs(adj, informTime, headID, 0);
        return max;
    }

    private void dfs(List<Integer>[] adj, int[] informTime, int currentIndex, int sum) {
        if (adj[currentIndex].isEmpty()) {
            max = Math.max(max, sum);
            return;
        }
        List<Integer> nextList = adj[currentIndex];
        for (int next : nextList) {
            dfs(adj, informTime, next, sum + informTime[next]);
        }
    }
}
