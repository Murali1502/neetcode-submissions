class Solution {
    private void s(int[] nums , int  i , int j){
        
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] =temp ;
       
        
        
    }
    public void sortColors(int[] nums) {
        int  l = 0 ; 
        int h = nums.length-1 ; 

        int mid = 0  ;

        while(mid <= h){
            if(nums[mid] == 0){
                s(nums,l , mid) ;
                l++ ;
                mid++ ; 
            }
            else if(nums[mid] == 1){
                mid++ ;
            }
            else{
                s(nums,mid,h) ; 
                h-- ;
            }
        }
        
    }
}