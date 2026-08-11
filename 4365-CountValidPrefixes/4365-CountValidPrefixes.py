# Last updated: 8/11/2026, 2:13:43 PM
class Solution:
    def countValidPrefixes(self, s: str) -> int:
        z=0
        o=0
        a=0

        for ch in s:
            if ch=='0':
                z+=1
            else:
                o+=1

            if abs(z-o)<=1:
                a+=1

        return a