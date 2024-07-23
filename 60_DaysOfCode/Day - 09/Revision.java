import java.util.*;

public class Revision {
    public static void main(String[] args) {

        int a[] = { 0, 0, 0, 1, 2, 3, 4, 5, 6 };
        int n = a.length - 1;

        // Easy Arrays -
        // System.out.println(SecondLargestElement(a, n);
        // System.out.println(isSorted(a, n));
        // System.out.println(removeDuplicates(a, n)); check upto i+1th position
        // System.out.println(Arrays.toString(leftRotateby1(a, n)));
        // System.out.println(Arrays.toString(leftRotatebyK(a, n, 3)));
        // System.out.println(Arrays.toString(moveZerosToEnd(a, n)));
        // System.out.println(linearSearch(a, n, 5));
        

        // Sorting -

        // MergeSort(a, 0, n);
        // System.out.println(Arrays.toString(a));

        // QuickSort(a, 0, n);
        // System.out.println(Arrays.toString(a));

        // 1. Selection sort - O(n^2)
        // for( int i = 0 ; i < n ; i++){
        // int minPos = i;
        // for( int j = i+1 ; j < n ; j++){
        // if(a[j] < a[minPos])
        // minPos = j;
        // }
        // int temp = a[i];
        // a[i] = a [minPos];
        // a[minPos] = temp;
        // }
        // System.out.println(Arrays.toString(a));

        // 2. Bubble Sort
        // for (int i = n-1; i >= 0; i--) {
        // for (int j = 0; j < i; j++) {
        // if (a[j] > a[j+1]) {
        // int temp = a[j];
        // a[j] = a[j+1];
        // a[j+1] = temp;
        // }
        // }
        // }
        // System.out.println(Arrays.toString(a));

        // 3. Insertion Sort
        // for(int i=0; i<n; i++){
        // int j=i;
        // while(j>0 && a[j-1]>a[j]){
        // int temp = a[j];
        // a[j] = a[j-1];
        // a[j-1] = temp;
        // j--;
        // }
        // }
        // System.out.println(Arrays.toString(a));

    }

    // 4. Merge sort
    // static void MergeSort(int arr[] , int low , int high){
    // if(low >= high) return;
    // int mid = ( low + high )/ 2;
    // MergeSort(arr , low, mid);
    // MergeSort(arr , mid+1 , high);
    // Merge(arr, low , mid , high);
    // }

    // static void Merge( int arr[] , int low, int mid, int high){
    // ArrayList<Integer> al = new ArrayList<Integer>();
    // int left = low;
    // int right = mid + 1;
    // while( left <= mid && right <= high){
    // if(arr[left] <= arr[right]){
    // al.add(arr[left]); left++;
    // }
    // else{
    // al.add(arr[right]); right++;
    // }
    // }
    // while(left <= mid){
    // al.add(arr[left]);
    // left++;
    // }
    // while(right <= high){
    // al.add(arr[right]);
    // right++;
    // }
    // for(int i = low ; i <= high ; i++){
    // arr[i] = al.get(i-low);
    // }
    // }

    // 5. Quick Sort
    // static void QuickSort(int a[], int low, int high) {
    // if (low < high) {
    // int pi = partition(a, low, high);
    // QuickSort(a, low, pi - 1);
    // QuickSort(a, pi + 1, high);
    // }
    // }
    // static int partition(int a[], int low, int high) {
    // int pivot = a[high];
    // int i = low - 1;
    // for (int j = low; j < high; j++) {
    // if (a[j] < pivot) {
    // i++;
    // int temp = a[i];
    // a[i] = a[j];
    // a[j] = temp;
    // }
    // }

    // int temp = a[i + 1];
    // a[i + 1] = a[high];
    // a[high] = temp;

    // return i + 1;
    // }

    // Easy Arrays -
    // int a[] = { 10, 4, 2, 9, 8, 6, 2, 5 };

    // 1. SecondLargestElement
    // static int SecondLargestElement(int arr[], int n) {
    // int max = Integer.MIN_VALUE;
    // int secMax = Integer.MIN_VALUE;
    // for (int i = 0; i <= n; i++) {
    // if (arr[i] > max) {
    // secMax = max;
    // max = arr[i];
    // } else if (arr[i] > secMax && arr[i] != max) {
    // secMax = arr[i];
    // }
    // }
    // return secMax;
    // }

    // 2. Check sorted array
    // static boolean isSorted(int a[], int n) {
    // for (int i = 0; i < n - 1; i++) {
    // if (a[i + 1] < a[i])
    // return false;
    // }
    // return true;
    // }

    // 3. Remove duplicates from sorted array
    // Brute force -
    // Set<Integer> set = new HashSet<>(); Using Hashset to avoid duplicates
    // for (int i = 0; i <= n; i++) {
    // set.add(a[i]);
    // }
    // ArrayList<Integer> al = new ArrayList<>(set);

    // static int removeDuplicates(int a[], int n) {
    // int i = 0;
    // for (int j = 0; j <= n; j++) {
    // if (a[i] != a[j]) {
    // i++;
    // a[i] = a[j];
    // }
    // }
    // return i + 1;
    // }

    // 4. left rotate array by 1 place
    // static int[] leftRotateby1(int a[] , int n){
    // int temp = a[0];
    // for (int i = 1; i <= n; i++)
    // a[i-1] = a [i];
    // a[n] = temp;
    // return a;
    // }

    // 5. left rotate by K places
    // static int[] leftRotatebyK(int a[] , int n, int k){
    // if(k<n){
    // reverse(a, 0, k-1);
    // reverse(a, k, n);
    // reverse(a, 0, n);
    // }
    // return a;
    // }
    // static void reverse(int a[], int start, int end){
    // while(start<=end){
    // int temp = a[start];
    // a[start] = a[end];
    // a[end] = temp;
    // start++; end--;
    // }
    // }

    // 6. move all zeros to end
    // static int[] moveZerosToEnd(int a[], int n) {
    //     int j = -1;
    //     for (int i = 0; i <= n; i++) {
    //         if (a[i] == 0) {
    //             j = i;
    //             break;
    //         }
    //     }
    //     for (int i = 0; i <= n; i++) {
    //         if (a[i] != 0) {
    //             int temp = a[i];
    //             a[i] = a[j];
    //             a[j] = temp;
    //             j++;
    //         }
    //     }
    //     return a;
    // }

    // 7. linear search
    static int linearSearch(int a[], int n, int key) {
        for (int i = 0; i <= n; i++) {
            if(a[i] == key)
            return i;
        }
        return -1;
    }
}