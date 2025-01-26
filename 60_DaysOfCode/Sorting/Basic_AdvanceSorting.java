import java.util.ArrayList;
import java.util.Arrays;

public class Basic_AdvanceSorting {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 6, 8, 3, 9, 4, 6, 5, 8, 7 };
        System.out.println("Original array: " + Arrays.toString(arr));
        // Basic Sorting [ O(n^2) ]  ~
        // SelectionSort(arr);
        // BubbleSort(arr);
        // InsertionSort(arr);

        // Better Sorting Techniques  ~
        // MergeSort(arr, 0, arr.length-1);
        // System.out.print("\nAfter merge sort: "); 
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        
        // QuickSort(arr, 0, arr.length - 1);
        // System.out.print("\nAfter quick sort: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

    }

    // 1. Selection Sort
    public static void SelectionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min_pos = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[min_pos])
                    min_pos = j;
            }
            int tp = a[i];
            a[i] = a[min_pos];
            a[min_pos] = tp; 
        }
        System.out.print("After selection sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // 2. Bubble Sort
    public static void BubbleSort(int a[]) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tp;
                }
            }
        }
        System.out.print("\nAfter bubble sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // 3. Insertion Sort
    public static void InsertionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j--;
            }
        }
        System.out.print("\nAfter insertion sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // 4. Merge Sort
    public static void MergeSort(int a[], int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        MergeSort(a, low, mid);
        MergeSort(a, mid + 1, high);
        Merge(a, low, mid, high);
    }

    static void Merge(int a[], int low, int mid, int high) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (a[left] < a[right]) {
                al.add(a[left]);
                left++;
            } else {
                al.add(a[right]);
                right++;
            }
        }
        while (left <= mid) {
            al.add(a[left]);
            left++;
        }
        while (right <= high) {
            al.add(a[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            a[i] = al.get(i - low);
        }
    }

    // 5. Quick Sort
    public static void QuickSort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            QuickSort(a, low, pi - 1);
            QuickSort(a, pi + 1, high);
        }
    }
    static int partition(int a[], int low, int high) {
        int pivot = a[high]; 
        int i = low - 1; 
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1; 
    }
}