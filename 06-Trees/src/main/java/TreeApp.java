public class TreeApp {
    public static void main(String[] args) {

        MyTree tree = new MyTree();


        int[] numbers=new int[] {10, 5, 12, 4, 6, 11, 13, 2,3,1};


        for (int i = 0; i<10;i++){
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null,false);
//
//
//        System.out.println("preorder");
//        tree.preOrderTraversal(tree.root);
//        System.out.println();
//
//
//        System.out.println("inorder");
//        tree.inOrderTraversal(tree.root);
//        System.out.println();
//
//        System.out.println("postorder");
//        tree.postOrderTraversal(tree.root);
//        System.out.println();



        //Breadth First
        System.out.println(BreadthFirst.bfPrint(tree));





    }
}
