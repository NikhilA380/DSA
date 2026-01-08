class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l = 0;
        
        int n = cardPoints.length;
        
        
        for(int i=0;i<k;i++){
            l += cardPoints[i];
        }
        
        int maxSum = l;
        int r = 0;
    
        for(int i=1;i<=k;i++){
            l -= cardPoints[k-i];
            r += cardPoints[n-i];
            maxSum  = Math.max(l+r,maxSum);

        }
        return maxSum;
    }
}