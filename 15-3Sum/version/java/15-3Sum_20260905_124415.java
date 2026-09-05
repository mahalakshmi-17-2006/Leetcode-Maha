// Last updated: 9/5/2026, 12:44:15 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3         List<List<Integer>> result = new ArrayList<>();        
4        Arrays.sort(nums);
5        
6        for (int i = 0; i < nums.length - 2; i++) {            
7            if (i > 0 && nums[i] == nums[i - 1]) {
8                continue;
9            }
10            
11            int left = i + 1;
12            int right = nums.length - 1;
13            
14            while (left < right) {
15                
16                int sum = nums[i] + nums[left] + nums[right];
17                
18                if (sum == 0) {
19                    
20                    result.add(Arrays.asList(
21                        nums[i], nums[left], nums[right]
22                    ));
23                    
24                    while (left < right && 
25                           nums[left] == nums[left + 1]) {
26                        left++;
27                    }
28                    
29                    while (left < right && 
30                           nums[right] == nums[right - 1]) {
31                        right--;
32                    }
33                    
34                    left++;
35                    right--;
36                    
37                } else if (sum < 0) {
38                    left++;
39                } else {
40                    right--;
41                }
42            }
43        }
44        
45        return result;
46    }
47}