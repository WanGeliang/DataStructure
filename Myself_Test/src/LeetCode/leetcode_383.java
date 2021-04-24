package LeetCode;

public class leetcode_383 {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[26];
        int[] b = new int[26];
        for(char c:ransomNote.toCharArray()){
            a[c-'a']++;
        }
        for(char c:magazine.toCharArray()){
            a[c-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (a[i]>b[i]) return false;
        }
        return true;
    }
}
