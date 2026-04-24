/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();

        Node original = head;

        while (original != null) {
            Node copy = new Node(0);
            map.put(original, copy);
            original = original.next;
        }

        original = head;

        while (original != null) 
        {
            Node copy = map.get(original);
            copy.val = original.val;
            copy.next = map.get(original.next);
            copy.random = map.get(original.random);
            original = original.next;
        }

        return map.get(head);
    }
}
