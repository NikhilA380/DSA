class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        
        for(int i=0;i<k;i++){
            l += cardPoints[i];
        }
        sum = l;
        int maxSum = sum;
        int f = 0;
        for(int i=k-1;i>=0;i--){
            l -= cardPoints[i];
            r += cardPoints[cardPoints.length-1-f];
            f++;
            sum = l+r;
            maxSum  = Math.max(sum,maxSum);

        }
        return maxSum;
    }
}