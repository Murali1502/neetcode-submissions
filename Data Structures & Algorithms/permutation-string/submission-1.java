class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) return false;
        int[] map1 = new int[26] ;
        int[] map2 = new int[26] ;

        for(char c : s1.toCharArray()){
            map1[c - 'a']++ ; 

        }
        int win = s1.length() ;


        for(int i = 0 ; i< win ; i++){
            map2[s2.charAt(i) -'a']++ ;
        }
        if(match(map1,map2)) return true ; 

        for(int i = win ; i< s2.length() ; i++){
            map2[s2.charAt(i) - 'a']++ ; 
            map2[s2.charAt(i-win) -'a']-- ; 
            

            if(match(map1,map2)) return true ; 

        }

       return false ; 


        
    }
    private boolean match(int[]a , int[] b){
        for(int i = 0 ; i< 26 ;i++){
            if(a[i] != b[i]){
                return false ;
            }
        }
        return true; 

    }
}
