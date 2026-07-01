class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int[26] ; 

        int l = 0  ; int mc = 0 ;  int maxc = 0 ;

        for(int r = 0 ; r<s.length() ; r++){
            freq[s.charAt(r) - 'A']++ ; 

            mc = Math.max(mc,freq[s.charAt(r) - 'A']);


            while((r - l +1)-mc > k){
                          freq[s.charAt(l) - 'A']-- ;
                          l++ ;   
            }
             maxc = (r-l+1) ; 
        }
        return maxc ; 
       
        
    }
}
