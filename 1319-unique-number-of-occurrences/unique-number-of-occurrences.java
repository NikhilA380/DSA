class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            set.add(entry.getValue());
        }

        if(set.size()==map.size()){
            return true;
        }

        return false;
    }
}