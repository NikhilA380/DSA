class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int k = s1.length();

        if(n<k) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for(int c : s1.toCharArray()){
            s1Count[ c -'a']++;
        }

        for(int i=0;i<n;i++){

            windowCount[s2.charAt(i)-'a']++;

            if(i>=k){
                windowCount[s2.charAt(i-k)-'a']--;
            }

            if(Arrays.equals(s1Count,windowCount)){
                return true;
            }
        }
        return false;
    }
}