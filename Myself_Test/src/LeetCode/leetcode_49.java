package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 */
public class leetcode_49 {
    public static void main(String[] args) {

    }

    /**
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     * @param strs
     * @return
     */

    //利用单词进行排序
    //将相同的key加入到一个List里面
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs==null||strs.length==0) return new ArrayList<>();
        List<String> tempList=new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)) map.put(key,new ArrayList());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
