package DataStructure.Heaps;

import static java.util.Collections.swap;

public class MaxHeap {
    int[] arr;//array for the heap
    int maxSize;//max size of the array
    int heapSize;//current no of elements in heap


    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.heapSize = 0;
        this.arr = new int[maxSize];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int leftChild(int i) {
        return 2 * i + 1;
    }

    int rightChild(int i) {
        return 2 * i + 2;
    }


    void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);

        int largest = i;
        if (arr[left] > arr[largest]) {
            largest = left;

        }
        if (arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }


    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void insert(int key) {
        if (heapSize == maxSize) {
            System.out.println("Overflown,could not insert!");
            return;
        }
        heapSize++;
        int index = heapSize - 1;
        arr[index] = key;
        //so that it inserts at the available last index

        //Heapify Up

        while (arr[parent(index)] < arr[index]) {
            swap(index, parent(index));
            index = parent(index);

        }
    }

    int extractMax() {
        if (heapSize <= 0) {
            return -1;
        }

        int root = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;
        heapify(0);


        return root;


    }

    void increaseKey(int i, int newVal) {
        arr[i] = newVal;
        while (arr[parent(i)] < arr[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }


    void removeKey(int i) {
        increaseKey(i, Integer.MAX_VALUE);
        extractMax();

    }
    int size(){
        return heapSize;
    }
}
class Driver {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(10);
        int[] keys = {3, 10, 12, 8, 2, 14};
        for (int key : keys) {
            h.insert(key);
        }

        System.out.println("Current Heap Size " + h.size());
        h.removeKey(10);
        System.out.println("Current Heap Size" + h.size());
    }
}









