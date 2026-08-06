class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<>();
        int most = candies[0];

        for(int i=1;i<candies.length;i++){
            most = Math.max(most,candies[i]);
        }

        for(int i=0;i<candies.length;i++){
            int sum = 0;
            sum = candies[i] + extraCandies;

            if(sum >= most){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}