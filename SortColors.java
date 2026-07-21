class Solution {
    public void sortColors(int[] nums) {
        int temp,n;
        n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        
    }
}
