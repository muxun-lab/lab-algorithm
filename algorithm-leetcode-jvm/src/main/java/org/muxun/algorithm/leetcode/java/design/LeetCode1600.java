package org.muxun.algorithm.leetcode.java.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 题号: 1600
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/throne-inheritance">王位继承顺序</a>
 * <p>
 * 详情: 题干过长，直接看链接
 * @author 慕勋
 * @created 2024-04-07
 */
public class LeetCode1600 {

    private final String kingName;
    private final HashMap<String, List<String>> treeMap;
    private final HashSet<String> deathSet;

    public LeetCode1600(String kingName) {
        this.kingName = kingName;
        this.treeMap = new HashMap<>();
        this.deathSet = new HashSet<>();
        this.treeMap.put(kingName, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        treeMap.get(parentName).add(childName);
        treeMap.put(childName, new ArrayList<>());
    }

    public void death(String name) {
        deathSet.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> orderList = new ArrayList<>();
        dfs(kingName, orderList);
        return orderList;
    }

    private void dfs(String name, List<String> orderList) {
        if (!deathSet.contains(name)) {
            orderList.add(name);
        }
        List<String> childrenList = treeMap.getOrDefault(name, new ArrayList<>());
        for (String child : childrenList) {
            dfs(child, orderList);
        }
    }
}
