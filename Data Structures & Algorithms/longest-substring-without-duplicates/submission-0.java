class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>seen  =  new HashSet<>() ; 


        int left = 0 ; 
        int right = 0 ; 
        int ans = 0 ;

        while(right < s.length() ){
            char c = s.charAt(right) ;
            if(!seen.contains(c)){ 
                seen.add(c) ;
                ans =  Math.max(ans , right - left +1); 
                right++ ;

            }
            else{
                seen.remove(s.charAt(left)) ;
                left++ ;
            }
        }
        return ans ; 
        
    }
}
