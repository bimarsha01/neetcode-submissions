// import java.util.HashMap;

class LRUCache {

    static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<Integer, Node> map;
    private Node LRU;
    private Node MRU;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        LRU = new Node(-1, -1);
        MRU = new Node(-1, -1);

        LRU.next = MRU;
        MRU.prev = LRU;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        add(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);

            remove(node);
            map.remove(key);
        }

        if (map.size() == capacity) {
            Node lru = LRU.next;

            remove(lru);
            map.remove(lru.key);
        }

        Node newNode = new Node(key, value);

        add(newNode);
        map.put(key, newNode);
    }

    private void add(Node node) {
        Node previous = MRU.prev;

        previous.next = node;
        node.prev = previous;

        node.next = MRU;
        MRU.prev = node;
    }

    private void remove(Node node) {
        Node previous = node.prev;
        Node next = node.next;

        previous.next = next;
        next.prev = previous;
    }
}