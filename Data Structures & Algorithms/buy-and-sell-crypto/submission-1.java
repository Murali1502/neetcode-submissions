// class Solution {
//     public int maxProfit(int[] prices) {
//         int min = Integer.MAX_VALUE ; 
//         int max = 0 ;

//         for(int n :prices){
//             if(n < min){
//                 min = n ; 
//             }
//             else{
//                 max  = Math.max(max , n - min) ; 
//             }
//         }
//         return max ; 
        
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE ; 
        int max = 0 ;

        for(int n :prices){
            if(n < min){
                min = n ; 
            }
            else if(n - min > max){
                max = n - min ; 
            }
        }
        return max ; 
        
    }
}