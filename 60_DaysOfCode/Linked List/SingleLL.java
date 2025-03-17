class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};

public class SingleLL {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = LLhead(arr);

        LLtraverse(head);
        LLcountsearch(head, 4);

        // head = LLdelete(head, 8);
        // LLtraverse(head);

        // head = LLinsert(head, 0, 1);
        // LLtraverse(head);

        head = LLreverse(head);
        LLtraverse(head);

    }

    // Intializing a head and making a LL
    static Node LLhead(int arr[]) {
        Node head = new Node(arr[0]);
        Node p = head;
        for (int i = 1; i < arr.length; i++) {
            Node n = new Node(arr[i]);
            p.next = n;
            p = n;
        }
        return head;
    }

    // Traversing a LL
    static void LLtraverse(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null)
                System.out.println(temp.data);
            else
                System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    // Counting and Searching in a LL
    static void LLcountsearch(Node head, int key) {
        Node temp = head;
        int count = 0, keypos = 0;
        while (temp != null) {
            count++;
            if (temp.data == key)
                keypos = count;
            temp = temp.next;
        }
        System.out.println("Length: " + count);
        System.out.println("Key found at: " + keypos);
    }

    // Deletion of node in LL
    static Node LLdelete(Node head, int k) {
        // delete head node
        if (k == 1) {
            Node temp = head;
            if (temp == null || temp.next == null) {
                return null;
            }
            head = temp.next;
        }

        // delete tail node
        else if (k == 5) {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        // delete any pos node
        else {
            int count = 0;
            Node temp = head;
            Node prev = temp;
            while (temp != null) {
                count++;
                if (count == k) {
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    // Insertion of node into LL
    static Node LLinsert(Node head, int val, int k) {
        // insert at start
        if (k == 1) {
            Node temp = new Node(val, head);
            if (head == null)
                return new Node(val);
            temp.next = head;
            return temp;
        }

        // insert at end
        else if (k == 5) {
            Node temp = head;
            Node p = new Node(val);
            if (head == null)
                return p;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = p;
        }

        // insert at any posistion
        else {
            int count = 0;
            Node temp = head;
            while (temp.next != null) {
                count++;
                if (count == k - 1){
                    Node p = new Node(val, temp.next);
                    temp.next = p;
                    return head;
                }
                    temp = temp.next;
            }
        }
        return head;
    }

    static Node LLreverse(Node head) {
        if(head == null || head.next == null)
            return head;
        Node o = null , p = head;
        while(p != null){
            Node n = p.next;
            p.next = o;
            o = p;
            p = n;
        }
        return o;
    }
} 