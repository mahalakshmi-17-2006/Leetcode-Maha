// Last updated: 8/15/2026, 2:35:47 PM
1class RandomizedSet {
2    ArrayList<Integer> list;
3    HashMap<Integer, Integer> map;
4    Random random;
5
6    public RandomizedSet() {
7        list = new ArrayList<>();
8        map = new HashMap<>();
9        random = new Random();  
10    }
11    
12    public boolean insert(int val) {
13        if (map.containsKey(val)) {
14            return false;
15        }
16
17        list.add(val);
18        map.put(val, list.size() - 1);
19
20        return true;
21    }
22    
23    public boolean remove(int val) {
24         if (!map.containsKey(val)) {
25            return false;
26        }
27
28        int index = map.get(val);
29        int last = list.get(list.size() - 1);
30        list.set(index, last);
31        map.put(last, index);
32        list.remove(list.size() - 1);
33        map.remove(val);
34
35        return true;
36    }
37    
38    public int getRandom() {
39        int index = random.nextInt(list.size());
40        return list.get(index);
41    }
42}
43
44/**
45 * Your RandomizedSet object will be instantiated and called as such:
46 * RandomizedSet obj = new RandomizedSet();
47 * boolean param_1 = obj.insert(val);
48 * boolean param_2 = obj.remove(val);
49 * int param_3 = obj.getRandom();
50 */