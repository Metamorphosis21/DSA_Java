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
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = DLLhead(arr);

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
}
