class Solution {

    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        Set<String> list = new HashSet<>();
        String longest ="";

        for(int i=0;i<s.length();i++ ){
            
            for(int j=0;j<s.length();j++){
                
                if(isPalindrome(s,i,j)){
                    int len = j-i+1;
                    if(len>longest.length()){
                        longest = s.substring(i,j+1);
                    }
                }
            }    
        }
        return longest;
    }
}