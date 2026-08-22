// Last updated: 8/22/2026, 9:28:22 AM
1class LRUCache {
2     class Node {
3        int key, value;
4        Node prev, next;
5
6        Node(int key, int value) {
7            this.key = key;
8            this.value = value;
9        }
10    }
11
12    int capacity;
13    HashMap<Integer, Node> map = new HashMap<>();
14
15    Node head = new Node(0, 0);
16    Node tail = new Node(0, 0);
17    public LRUCache(int capacity) {
18        this.capacity = capacity;
19
20        head.next = tail;
21        tail.prev = head;
22    }
23    
24    public int get(int key) {
25         if (!map.containsKey(key)) {
26            return -1;
27        }
28
29        Node node = map.get(key);
30        remove(node);
31        insert(node);
32
33        return node.value;
34    }
35    
36    public void put(int key, int value) {
37         if (map.containsKey(key)) {
38            Node node = map.get(key);
39            node.value = value;
40            remove(node);
41            insert(node);
42
43        } else {
44            if (map.size() == capacity) {
45                Node lru = tail.prev;
46
47                remove(lru);
48                map.remove(lru.key);
49            }
50
51            Node newNode = new Node(key, value);
52
53            insert(newNode);
54            map.put(key, newNode);
55        }
56    }
57     private void remove(Node node) {
58        node.prev.next = node.next;
59        node.next.prev = node.prev;
60    }
61    private void insert(Node node) {
62        node.next = head.next;
63        node.prev = head;
64
65        head.next.prev = node;
66        head.next = node;
67    }
68}
69
70/**
71 * Your LRUCache object will be instantiated and called as such:
72 * LRUCache obj = new LRUCache(capacity);
73 * int param_1 = obj.get(key);
74 * obj.put(key,value);
75 */