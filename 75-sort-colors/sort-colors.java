class Solution {
    public void sortColors(int[] nums) {
       int r = 0;
       int w = 0;
       int b = 0;

       for(int num : nums){
            if(num == 0){
                r+=1;
            }else if(num ==1){
                w+=1;
            }else{
                b+=1;
            }
       }
       
        int index = 0;

       for(int i=0;i<r;i++){
        nums[index ++] = 0;
       }
       for(int i=0;i<w;i++){
        nums[index ++] = 1;
       }
       for(int i=0;i<b;i++){
        nums[index ++] = 2;
       }
        
    }
}