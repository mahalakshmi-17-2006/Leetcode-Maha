// Last updated: 10/13/2026, 11:54:48 AM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> set = new HashSet<>(wordList);
4
5        if (!set.contains(endWord))
6            return 0;
7
8        Queue<String> q = new LinkedList<>();
9        q.add(beginWord);
10
11        int count = 1;
12
13        while (!q.isEmpty()) {
14            int size = q.size();
15
16            for (int i = 0; i < size; i++) {
17                String word = q.poll();
18
19                if (word.equals(endWord))
20                    return count;
21
22                char[] arr = word.toCharArray();
23
24                for (int j = 0; j < arr.length; j++) {
25                    char original = arr[j];
26
27                    for (char c = 'a'; c <= 'z'; c++) {
28                        arr[j] = c;
29                        String next = new String(arr);
30
31                        if (set.contains(next)) {
32                            q.add(next);
33                            set.remove(next);
34                        }
35                    }
36
37                    arr[j] = original;
38                }
39            }
40
41            count++;
42        }
43
44        return 0;
45    }
46}