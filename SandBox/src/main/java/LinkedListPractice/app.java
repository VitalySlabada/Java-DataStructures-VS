package LinkedListPractice;

public class app {
    public static void main(String[] args) {


        //Create Linked list and populate  with 10 nodes
        MyLinkedList lList = new MyLinkedList();
//        for (int i = 1; i <= 10; i++) {
//            lList.add(i * 10);
//        }
//
//        //Print all
//        System.out.println("Created LList");
//        lList.printAll();
//
//        //insert Kth
//        System.out.println("##### Inserting Kth #####");
//        lList.insertKth(0,555);
//        lList.printAll();
//        lList.insertKth(3,555);
//        lList.printAll();
//        lList.insertKth(11,555);
//        lList.printAll();
//        lList.insertKth(23,555);
//
//        //delete Kth
//        System.out.println("#####delete kth#####");
//        lList.printAll();
//        lList.deleteKth(0);
//        lList.printAll();
//        lList.deleteKth(-1);
//        lList.printAll();
//        lList.deleteKth(4);
//        lList.printAll();
//        lList.deleteKth(1);
//        lList.printAll();
//        lList.deleteKth(8);
//        lList.printAll();
//        lList.deleteKth(8);
//        lList.printAll();


        // Reveresing
//        System.out.println("########### Reverse");
//        lList.reverseLList();
//        lList.add(1);
//        lList.reverseLList();
//        lList.printAll();

//        lList.add(2);
//        lList.printAll();
//        lList.reverseLList();
//        lList.printAll();
//
//        lList.add(3);
//        lList.add(4);
//        lList.add(5);
//        lList.printAll();
//        lList.reverseLList();
//        lList.printAll();

        //######## Remove Duplicates ######
        lList.add(1);
        lList.add(1);
        lList.add(1);
        lList.add(2);
        lList.add(3);
        lList.add(3);
        lList.add(4);
        lList.add(4);
        lList.add(4);
        lList.add(4);
        lList.add(4);
        lList.printAll();
        lList.removeDuplicatesFromSorted();
        lList.printAll();

        //Cloning
        System.out.println("clone llist :");
        MyLinkedList clone1 = lList.cloneLinkedList();


        clone1.printAll();

//        System.out.println(MyLinkedList.compare2LLists(lList,clone1));
//        clone1.add(3);
//        clone1.add(2);
//        clone1.add(1);
//        clone1.add(3);
//        clone1.printAll();
//        System.out.println(clone1.isPalindrome());


        // sorting
        System.out.println("sort descending Before");

        clone1.printAll();
        System.out.println("sort descending After");
        clone1.sortDescending();
        clone1.printAll();

//        //find max
//        MyLinkedList llist1 = new MyLinkedList();
//        llist1.add(3);
//        llist1.add(89);
//        System.out.println("find max");
//        System.out.println(llist1.findMax());

//        //deleting
//        System.out.println("######deleting#####");
//        clone1.printAll();
//        clone1.deleteFirstNodeWithNum(4);
//        clone1.printAll();
//        clone1.deleteFirstNodeWithNum(1);
//        clone1.deleteFirstNodeWithNum(1);
//        clone1.deleteFirstNodeWithNum(1);
//        clone1.printAll();
//
//        clone1.deleteFirstNodeWithNum(3);
//        clone1.deleteFirstNodeWithNum(3);
//        clone1.deleteFirstNodeWithNum(3);
//        clone1.printAll();
//
//        clone1.deleteFirstNodeWithNum(2);
//        clone1.deleteFirstNodeWithNum(2);
//        clone1.deleteFirstNodeWithNum(2);
//        clone1.printAll();





//        System.out.println("deleting");
//        //delete node with num
//        lList.printAll();
//        lList.deleteNodeWithNum(2);
//        lList.printAll();

    }
}
