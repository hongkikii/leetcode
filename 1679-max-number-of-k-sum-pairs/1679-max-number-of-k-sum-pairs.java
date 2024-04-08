class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int sum = 0;
        int answer = 0;
        while(left < right) {
            sum = nums[left] + nums[right];
            if(sum == k) {
                answer++;
                left++;
                right--;
            }
            else if(sum > k) {
                right--;
            } 
            else {
                left++;
            }
        }
        return answer;
    }
}