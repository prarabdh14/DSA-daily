class LRUCache 
{
    class Node
    {
        int value;
        int key;
        Node prev;
        Node next;

        public Node(int key, int value)
        {
            this.key = key;
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;
    private Node start, end;

    public LRUCache(int capacity) 
    {
        this.capacity = capacity;
        map = new HashMap<>(capacity);    

        start = new Node(0,0);
        end = new Node(0,0);

        start.next = end;
        end.prev = start;
    }
    public int get(int key) 
    {
        if(!map.containsKey(key))
        return -1;
        else
        {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
    }    
    public void put(int key, int value) 
    {
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);
            return;
        }    
        if (map.size() == capacity) 
        {
            Node node = end.prev;
            remove(node);
            map.remove(node.key);
        }
        Node newNode = new Node(key, value);
        insert(newNode);
        map.put(key, newNode);
        
    }
    private void remove(Node node) 
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) 
    {
        node.next = start.next;
        node.prev = start;

        start.next.prev = node;
        start.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */