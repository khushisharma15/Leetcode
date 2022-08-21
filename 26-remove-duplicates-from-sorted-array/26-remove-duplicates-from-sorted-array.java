class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return 1;
        }
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i] ==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
        
    }
}