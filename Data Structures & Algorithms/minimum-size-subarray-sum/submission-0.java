class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l = 0 ; int minl = Integer.MAX_VALUE  ;int total = 0 ; 


        for(int r = 0 ; r<nums.length ; r++){
            total += nums[r] ; 

            while(total >= target){
                minl = Math.min(minl,(r-l+1)) ; 
                total -=nums[l] ;
                l++ ; 
            }
        
        }
         if(minl ==Integer.MAX_VALUE){
            return 0 ; 
        }
        else{
            return minl;
        }
        
    }
}