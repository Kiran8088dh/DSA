class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int res: nums){
             sum+=res;
        }
        return sum%2==0 ? nums.length-1 : 0; 
}
}