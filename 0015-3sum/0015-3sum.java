class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int target=-nums[i];
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                if(nums[j]+nums[k]==target){
                    List<Integer> subList=new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[j]);
                    subList.add(nums[k]);
                    ans.add(subList);
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}