import java.util.ArrayList;

class Node {
    int data;
    Node next;
    Node prev;
    
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class EasyMediumDLL {
    public static void main(String args[]){
        
    }

    // 1: Delete all occurrences of X from doubly linked list
    static Node deleteAllOccurOfX(Node head, int x) {
        if(head == null)
            return head;
        Node temp = head;
        while(temp!=null){
            if(temp.data == x){
                if(temp ==head)
                    head = head.next;
                Node nextN = temp.next;
                Node prevN = temp.prev;
                
                if(nextN != null)   nextN.prev = prevN;
                if(prevN != null)   prevN.next = nextN;
                temp = nextN;
            }
            else
                temp = temp.next;
        }
        return head;
    }

    // 2: Remove duplicates from sorted doubly linked list
    Node removeDuplicates(Node head){
        Node temp = head;
        while(temp != null && temp.next != null){
            Node nextN = temp.next;
            while(nextN != null && nextN.data == temp.data){
                nextN = nextN.next;
            }
            temp.next = nextN;
            if(nextN != null) nextN.prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // 3: Find pairs with given sum in sorted doubly linked list
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Node left = head;
        Node right = head;
        while(right.next != null){
            right = right.next;
        }
        while(left.data < right.data){
            ArrayList<Integer> pair = new ArrayList<>();
            if(left.data + right.data == target){
                pair.add(left.data);
                pair.add(right.data);
                al.add(pair);
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data < target){
                left = left.next;
            }
            else{
                right = right.prev;
            }
        }
        return al;
    }
}