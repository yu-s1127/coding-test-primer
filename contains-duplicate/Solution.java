import java.util.HashMap;
import java.util.Map;

class Solution {

  // return true if nums[] contains dup
  // pre: nums[1,2,3,1]
  // post: true
  public Boolean containsDuplicate(int[] nums) {
    // cornder: nums.length() <= 1 return false
    if (nums.length <= 1) return false;

    Map<Integer, Boolean> map = new HashMap<>();
    // step1: single linear scan left -> right, build hashMap as we go
    for (int num : nums) {
    // step2: if map.containsKey(num[i]) == true, then dup found so return true
      if(map.containsKey(num)) {
        return true;
      }
      map.put(num, true);
    }
    // return false
    return false;
  }
}
