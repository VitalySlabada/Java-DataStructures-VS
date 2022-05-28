package p9_HeapAssignment;

public class KthLargestElementInArray {
    public static int findKthLargestNumBrute (int [] array, int k){
        MyHeap heap = new MyHeap(array.length);
        for (int each : array) heap.insert(each);

        int i = (int) Math.log(k);
        for (i = 1; i<k; i++ ) heap.remove();
        return heap.items[0];
    }
}
