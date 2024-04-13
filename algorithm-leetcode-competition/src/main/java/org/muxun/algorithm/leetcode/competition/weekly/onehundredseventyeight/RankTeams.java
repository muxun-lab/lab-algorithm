package org.muxun.algorithm.leetcode.competition.weekly.onehundredseventyeight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 题号：5345
 * 题目：通过投票对团队排名
 * 详情：现在有一个特殊的排名系统，依据参赛团队在投票人心中的次序进行排名，
 * 每个投票者都需要按从高到低的顺序对参与排名的所有团队进行排位。
 * 排名规则如下：
 * * 参赛团队的排名次序依照其所获「排位第一」的票的多少决定。如果存在多个团队并列的情况，将继续考虑其「排位第二」的票的数量。以此类推，直到不再存在并列的情况。
 * * 如果在考虑完所有投票情况后仍然出现并列现象，则根据团队字母的字母顺序进行排名。
 * <p>
 * 给你一个字符串数组 votes 代表全体投票者给出的排位情况，请你根据上述排名规则对所有参赛团队进行排名。
 * 请你返回能表示按排名系统 排序后 的所有团队排名的字符串。
 * @author sunshine
 * @created 2020-03-01
 */
public class RankTeams {

    /**
     * 思路：哈希
     * @param votes 给定的选票数组
     * @return 排序后的字符串
     */
    public String rankTeams(String[] votes) {
        if (votes.length <= 0) {
            return "";
        }
        if (votes.length == 1) {
            return votes[0];
        }
        Map<Character, Integer[]> resultMap = new HashMap<>();
        for (int i = 0; i < votes.length; i++) {
            String vote = votes[i];
            for (int j = 0; j < vote.length(); j++) {
                char currentRole = vote.charAt(j);
                if (!resultMap.containsKey(currentRole)) {
                    resultMap.put(currentRole, new Integer[vote.length()]);
                }
                Integer[] voteArray = resultMap.get(currentRole);
                Integer previous = voteArray[j];
                voteArray[j] = ((previous == null ? 0 : previous) + j + 1);
            }
        }
        List<Character> resultList = new LinkedList<>();
        Iterator<Character> resultIterator = resultMap.keySet().iterator();
        while (resultIterator.hasNext()) {
            Character key = resultIterator.next();
            if (resultList.size() == 0) {
                resultList.add(key);
                continue;
            }
            int start = 0;
            while (start < resultList.size()) {
                Integer[] previousArray = resultMap.get(resultList.get(start));
                Integer[] currentArray = resultMap.get(key);
                if (insert(previousArray, currentArray, resultList.get(start), key)) {
                    break;
                }
                start++;
            }
            resultList.add(start, key);
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (char c : resultList) {
            resultBuilder.append(c);
        }
        return resultBuilder.toString();
    }

    private boolean insert(Integer[] previousArray, Integer[] currentArray, char previous, char current) {
        for (int i = 0; i < previousArray.length; i++) {
            int currentVote = currentArray[i] == null ? 0 : currentArray[i];
            int previousVote = previousArray[i] == null ? 0 : previousArray[i];
            if (currentVote < previousVote) {
                return false;
            }
            if (currentVote > previousVote) {
                return true;
            }
            if (i == previousArray.length - 1) {
                if (current < previous) {
                    return true;
                }
            }
        }
        return false;
    }
}
