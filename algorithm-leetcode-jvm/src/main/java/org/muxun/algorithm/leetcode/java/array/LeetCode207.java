package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 207
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/course-schedule">课程表</a>
 * <p>
 * 详情: 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
 * <p>
 * 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
 * <p>
 * * 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
 * <p>
 * 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
 * @author 慕勋
 * @created 2024-03-12
 */
public class LeetCode207 {

    boolean valid;
    private List<List<Integer>> list;
    private int[] visited;

    /**
     * 思路: 深度优先遍历
     * @param numCourses    课程数量
     * @param prerequisites 课程学习顺序
     * @return 是否可以完成课程
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        this.list = new ArrayList<>();
        this.visited = new int[numCourses];
        this.valid = true;
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] course : prerequisites) {
            list.get(course[1]).add(course[0]);
        }
        for (int i = 0; i < numCourses && valid; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
        return valid;
    }

    private void dfs(int i) {
        visited[i] = 1;
        for (int x : list.get(i)) {
            if (visited[x] == 0) {
                dfs(x);
                if (!valid) {
                    return;
                }
            } else if (visited[x] == 1) {
                valid = false;
                return;
            }
        }
        visited[i] = 2;
    }
}
