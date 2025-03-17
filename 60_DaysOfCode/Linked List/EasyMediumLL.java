class Node {
    int data;
    Node next;
 
    Node(int var1, Node var2) {
       this.data = var1;
       this.next = var2;
    }
 
    Node(int var1) {
       this.data = var1;
       this.next = null;
    }
 }

 class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

 

public class EasyMediumLL {
    public static void main(String[] args){

    }
    // 1. Middle of LL
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 2. Reverse of LL
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode newhead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }

    // 3. LinkedList cycle detection
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    // 4. LinkedList cycle start point
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    // 5. Find length of loop
    public int countNodesinLoop(Node head) {
        Node slow = head;
        Node fast = head;
        int c = 1;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = slow.next;
                while(fast != slow) {
                    slow = slow.next;
                    c++;
                }
                return c;
            }
        }
        return 0;
    }

    // 6. Palindrome LL
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode head2 = prev;
        while(head2 != null) {
            if(head.val != head2.val) {
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }

    // 7. Odd even LL
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    // 8. Remove Nth node from last
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0; i < n; i++)
            fast = fast.next;
        if(fast == null)
            return head.next;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // 9. Delete middle node
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        ListNode fast = head.next.next;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // 10. Sort LL
    ListNode findmiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null) temp.next = l1;
        else temp.next = l2;
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode middle = findmiddle(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;

        left = sortList(left);
        right = sortList(right);
        return mergeList(left, right);
    }

    // 11. Sort LL 0s, 1s, 2s
    static Node segregate(Node head) {
        if(head == null || head.next == null)
            return head;
        Node dummy0 = new Node(-1);
        Node zero = dummy0;
        Node dummy1 = new Node(-1);
        Node one = dummy1;
        Node dummy2 = new Node(-1);
        Node two = dummy2;
        Node temp = head;
        while(temp != null) {
            if(temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = (dummy1.next != null) ? dummy1.next : dummy2.next;
        one.next = dummy2.next;
        two.next = null;
        return dummy0.next;
    }

    // 12. Y intersection
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) 
            return null;
        ListNode t1 = headA;
        ListNode t2 = headB;
        while(t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
            if(t1 == t2)
                return t1;
            if(t1 == null) t1 = headB;
            if(t2 == null) t2 = headA;
        }
        return t1;
    }

    // 13. Add 1 to LL
    int recursionOne(Node temp) {
        if(temp == null)
            return 1;
        int carry = recursionOne(temp.next);
        temp.data += carry;
        if(temp.data < 10)
            return 0;
        temp.data = 0;
        return 1;
    }

    public Node addOne(Node head) {
        int carry = recursionOne(head);
        if(carry == 1) {
            Node newHead = new Node(1);
            newHead.next = head;
            head = newHead;
        }
        return head;
    }

    // 14. Add Two Numbers
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode h1 = l1;
        ListNode h2 = l2;
        int carry = 0;
        while(h1 != null || h2 != null) {
            int sum = carry;
            if(h1 != null) sum += h1.val;
            if(h2 != null) sum += h2.val;
            ListNode temp = new ListNode(sum%10);
            carry = sum/10;
            curr.next = temp;
            curr = curr.next;
            if(h1 != null) h1 = h1.next;
            if(h2 != null) h2 = h2.next;
        }
        if(carry != 0) {
            ListNode last = new ListNode(carry);
            curr.next = last;
        }
        return dummy.next;
    }
}