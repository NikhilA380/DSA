class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        if(s.length()==0)return 0;

        for(int i=0;i<s.length();i++){
            
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max = Math.max(i - left + 1,max);
        }
        return max;
    }
}