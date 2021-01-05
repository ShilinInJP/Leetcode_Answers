//https://leetcode.com/problems/binary-search/
class Solution {
    public int search(int[] nums, int target) {
        int low, high;
        high = nums.length -1 ;
        low = 0; 
        while (low <= high){                     //一定要注意边界条件 low+1 high-1 表示错开中间位  相等表示可以收缩到一起
            int tem =  (low + high)/2;
            if (target == nums[tem] ) return tem;
            else if (target > nums[tem]){
                low = tem + 1;
            }
            else {
                high = tem -1 ; 
            }
        }
        return -1;       
    }
}
