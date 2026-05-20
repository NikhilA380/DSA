class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int targetSum = threshold * k;
        int windowSum = 0;

        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        if(windowSum >=targetSum){
            count++;
        }

        for(int i=k;i<arr.length;i++){
            
            windowSum += arr[i];
            windowSum -= arr[i-k];
            
            if(windowSum >=targetSum){
                count++;
            }
        }
        return count;
    }
}