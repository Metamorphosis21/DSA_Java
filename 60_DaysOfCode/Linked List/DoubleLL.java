class Node{
    int data;
    Node next;
    Node back;
    Node(int data, Node next,Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DoubleLL {
    public static void main(String args[]){
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8};
        Node head = DLLhead(arr);

        DLLtraverse(head);
        DLLcountsearch(head, 4);

        // head = DLLdelete(head, 6);
        // DLLtraverse(head);

        head = DLLinsert(head, 90, 3);
        DLLtraverse(head);

    }
 
    static Node DLLhead(int arr[]){
        Node head = new Node(arr[0]);
        Node p = head;
        for(int i = 1;i < arr.length;i++){
            Node temp = new Node(arr[i], null, p);
            p.next = temp;
            p = temp;
        }
        return head;
    }

    static void DLLtraverse(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null)
                System.out.println(temp.data);
            else
                System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    static void DLLcountsearch(Node head, int key) {
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

    static Node DLLdelete(Node head, int k) {
        if (head == null) return null; // Empty list case
    
        // Case 1: Deleting the head node
        if (k == 1) {
            if (head.next == null) return null; // Only one node
            Node temp = head;
            head = head.next;
            head.back = null;
            temp.next = null;
            return head;
        }
    
        Node temp = head;
        int count = 1;
    
        // Traverse to find the k-th node
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
    
        if (temp == null) return head; // If k is out of bounds, return original list
    
        // Case 2: Deleting the tail node
        if (temp.next == null) {  
            temp.back.next = null;  
            temp.back = null;  
            return head;
        }
    
        // Case 3: Deleting a middle node
        Node prev = temp.back;
        Node next = temp.next;
    
        prev.next = next;  // Connect previous node to the next
        if (next != null) {  // Ensure it's not the last node
            next.back = prev;
        }
    
        temp.next = null;
        temp.back = null;
    
        return head;
    }
    
    static Node DLLinsert(Node head, int val, int k) {
        // Case 1: Empty list
        if (head == null) {
            if (k == 1) return new Node(val);
            return null;  // Invalid position
        }
        // Case 2: Insert at beginning (k=1)
        if (k == 1) {
            Node newNode = new Node(val, head, null);
            head.back = newNode;
            return newNode;
        }
        // Case 3: Insert at any other position
        Node temp = head;
        int count = 1;
        // Traverse to the (k-1)th node
        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }
        // If k is out of bounds
        if (temp == null) return head;
        // Case 4: Insert at last position
        if (temp.next == null) {
            Node newNode = new Node(val, null, temp);
            temp.next = newNode;
            return head;
        }
        // Case 5: Insert in middle
        Node newNode = new Node(val, temp.next, temp);
        temp.next.back = newNode;
        temp.next = newNode;
    
        return head;
    }       
}