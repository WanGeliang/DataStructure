package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * ����һ���ַ������飬����ĸ��λ�������һ����ĸ��λ��ָ��ĸ��ͬ�������в�ͬ���ַ�����
 */
public class leetcode_49 {
    public static void main(String[] args) {

    }

    /**
     * ����: ["eat", "tea", "tan", "ate", "nat", "bat"]
     * ���:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     * @param strs
     * @return
     */

    //���õ��ʽ�������
    //����ͬ��key���뵽һ��List����
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
