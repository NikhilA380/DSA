class Solution {
    public int pivotInteger(int n) {
        
        for(int i=0;i<n;i++){
            int left = 0;
            int right = 0;

            for(int j=0;j<i;j++){
                left += j+1;
            }
            for(int j=i+1;j<n;j++){
                right += j+1;
            }

            if(left==right){
                return i+1;
            }
        }
        return -1;
    }
}