class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];

        for(int i=0;i<gain.length;i++){
            prefix[i+1] = prefix[i] + gain[i];
        }
        int higest = Integer.MIN_VALUE;

        for(int i=0;i<prefix.length;i++){
            higest = Math.max(higest,prefix[i]);
        }
        return higest;
    }
}