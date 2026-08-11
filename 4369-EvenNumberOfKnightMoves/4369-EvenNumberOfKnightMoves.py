# Last updated: 8/11/2026, 2:13:42 PM
from typing import List
class Solution:
    def canReach(self, start: list[int], target: list[int]) -> bool:
       start = (start[0]+start[1]) % 2
       target=(target[0]+target[1]) % 2
       return start==target