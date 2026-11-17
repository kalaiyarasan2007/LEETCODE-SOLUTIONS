
class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0;
        int count = 0;

        map.put(0L, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            long rem = sum - k;
        if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}