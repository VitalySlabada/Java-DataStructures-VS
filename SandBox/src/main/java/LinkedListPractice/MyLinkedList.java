package LinkedListPractice;

import java.util.LinkedList;

import static java.lang.System.exit;

public class MyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public MyLinkedList() {
        this.size = 0;
    }


    //########### Methods ###########
    //Must haves:
    //ADD
    //Delete
    //Insert

    //ADD
    public void add(int num) {

        Node node = new Node(num);
        // if empty
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    //insert Kth
    public void insertKth(int index, int num) {
        //if empty or last
        if (isEmpty() || (size == index)) this.add(num);
            // if first
        else if (index == 0) {
            Node newNode = new Node(num);
            newNode.next = head;
            head = newNode;
            size++;
        }

        //if Middle
        else if (index < size - 1) {
            Node current = head;
            Node newNode = new Node(num);
            //propagate current to be the node before the inserted one
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        } else System.out.println("no such index available");
    }

    //delete Kth
    public void deleteKth(int index) {
        if (index >= size || index < 0) System.out.println("no such member or nothing to delete");
            //delete first
        else if (index == 0) {
            head = head.next;
            size--;
        }
        //delete middle or last
        else {
            Node prev = head;
            Node current = head.next;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
                prev = prev.next;
            }
            prev.next = current.next;
            current = null;
            size--;
        }
    }


    //Nice to have methods:
    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    //indexOf
    //getSize
    //print
    public void printAll() {
        //if Empty
        if (isEmpty()) System.out.println("linked list is empty");
        else {
            Node current = head;
            while (current != null) {
                System.out.print(current.num + "->");
                current = current.next;
            }
            System.out.println("null Total size: " + size);
        }
    }


    //Reverese a linked list in one pass
    public void reverseLList() {
        //if empty
        if (isEmpty()) System.out.println("nothing to reverse");

        else if (size == 1) ;

        else if (size == 2) {
            tail.next = head;
            head = tail;
            tail = head.next;
            tail.next = null;
        } else if (size >= 3) {
            Node prev = head;
            Node curr = head.next;
            Node future = head.next.next;
            prev.next = null;

            while (future != null) {
                curr.next = prev;
                prev = curr;
                curr = future;
                future = future.next;
            }
            curr.next = prev;
            tail = head;
            head = curr;
        }
    }


    // Remove duplicate form a sorted
    public void removeDuplicatesFromSorted() {
        // special cases for 0 and 1
        if (size < 2) System.out.println("nothing to remove");

            //for 2 nodes and more
        else {
            // make 2 temp pointer structure and assign
            // prev -> curr

            Node prev = head;
            Node curr = head.next;

            //while loop to traverse through the LList
            while (curr != null) {
                //condition for duplicates
                if (prev.num == curr.num) {
                    //if found -> eliminate current node by assigning prev.next to current.next
                    prev.next = curr.next;
                    curr = curr.next;
                    size--;
                    //continue in case more than one duplicate in a row
                    continue;
                }
                // if no duplicate found, move to the  next pair
                prev = curr;
                curr = curr.next;
            }
        }
    }

    public MyLinkedList cloneLinkedList() {
        //Declare a copy
        MyLinkedList clone = new MyLinkedList();
        Node curr = head;
        if (isEmpty()) return null;
        // if size is more than 0 then create head of clone
        while (curr != null) {
            clone.add(curr.num);
            curr = curr.next;
        }
        return clone;
    }

    static public boolean compare2LLists(MyLinkedList llist1, MyLinkedList llist2) {
        Node curr1 = llist1.head;
        Node curr2 = llist2.head;
        if (llist1.size != llist2.size) return false;
        while (curr1 != null) {
            if (curr1.num != curr2.num) return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }

    public boolean isPalindrome() {
        MyLinkedList clone = this.cloneLinkedList();
        clone.reverseLList();
        return compare2LLists(clone, this);
    }


    public void deleteFirstNodeWithNum(int num) {

        if (head == null) {
            System.out.println("delete first node empty");
            return;
        }
        //delete head
        if (head.num == num) {
            head = head.next;
            size--;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            if (curr.next.num == num) {
                curr.next = curr.next.next;
                size--;
                return;
            }
            curr = curr.next;

        }
    }

    public int findMax() {
        if (size == 0) {
            System.out.println("findMax empty");
            exit(-1);
        }
        Node curr = head;
        int max = curr.num;
        while (curr != null) {
            if (curr.num > max) max = curr.num;
            curr = curr.next;
        }
        return max;
    }

    public void sortDescending() {

        if (size == 0) {
            System.out.println("sorting EMPTY");
            return;
        }
        if (size == 1) {
            System.out.println("1 member nothing to sort");
            return;
        }
        Node curr = this.head;
        MyLinkedList clone = new MyLinkedList();
        while (this.size!=0) {
            //find max
            int max = this.findMax();
            //add to new
            clone.add(max);
            //delete max
            this.deleteFirstNodeWithNum(max);
        }
        head = clone.head;

    }

}
