

class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        int xor = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {

            if(set.contains(nums[i])) {
                xor = xor ^ nums[i];
            }
            else {
                set.add(nums[i]);
            }
        }

        return xor;
    }
}