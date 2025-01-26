import java.util.*;

public class EasyArrays {
    public static void main(String[] args) {
        int[] arr = { 1,1,0,1,1,0,1,1,0,0,1,1 };
        int[] sortArr1 = { 1,2,3,4,5,7,8,9};
        int[] sortArr2 = { 2,4,6,8,9,11};
        int[] dupArr = { 1, 1, 3, 4, 4, 5, 5 };
        // System.out.println("Largest element in the array is: " + BruteMaxElement(arr));
        // System.out.println("Largest element in the array is: " + RecMaxElement(arr,arr.length - 1));

        // System.out.println("Second largest element in the array: " + BetterSecMaxElement(arr));
        // System.out.println("Second largest element in the array: " + OptimalSecMaxElement(arr));

        // System.out.println("Is the array sorted? : "+isSortedArray(sortArr));
        
        System.out.println(Arrays.toString(dupArr));
        System.out.println("Removed dupilicates: " + removeDuplicates(dupArr));
        System.out.println(Arrays.toString(dupArr));

        // System.out.println("After Left rotate: " + Arrays.toString(leftRotateArray(arr)));

        // System.out.println("Rotate to left by d: "+ Arrays.toString(RotateeletoleftbyK(arr, arr.length, 5)));

        // System.out.println("Moving Zeros to end: "+ Arrays.toString(moveZerostoEnd(arr, arr.length)));

        // System.out.println("Element present at: "+linearSearchArr(arr,1212));

        // System.out.println("Missing Element in array is: "+missingNumArr(sortArr));

        // System.out.println("Max consecutive 1s: "+maxCons1sArr(arr));

        // System.out.println("Union of 2 sorted array: "+unionArrBrute(sortArr1, sortArr2));
        // System.out.println("Union of 2 sorted array: "+unionArrOptimal(sortArr1, sortArr2));

        // System.out.println("Single element in the array is: "+findSingleElement(dupArr));

        // System.out.println("Longest subarray of sum K is:"+getLongestSubarray(arr,5));
    }

    // 1. Largest element in an array
    // Brute Force ~
    public static int BruteMaxElement(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Recursive approach ~
    static int recMax = Integer.MIN_VALUE;

    public static int RecMaxElement(int a[], int n) {
        if (n < 0)
            return recMax;
        else
            recMax = Math.max(a[n], recMax);

        return RecMaxElement(a, n - 1);
    }

    // 2. 2nd largest element in an array
    // Better Approach ~
    public static int BetterSecMaxElement(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max: " + max);
        int sMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > sMax && a[i] < max)
                sMax = a[i];
        }
        return sMax;
    }

    // Optimal Approach ~
    public static int OptimalSecMaxElement(int a[]) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                sMax = max;
                max = a[i];
            } 
            else if (a[i] > sMax && a[i] != max)
                sMax = a[i];
        }
        return sMax;
    }

    // 3. Check if array is sorted
    // Optimal Approach ~
    public static boolean isSortedArray(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] < a[i])
                return false;
        }
        return true;
    }

    // 4. Remove duplicates from a sorted array
    // Optimal Approach ~
    public static int removeDuplicates(int a[]) {
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        return i + 1;
    }

    // 5. Left rotate an array by 1
    // Optimal Approach ~
    public static int[] leftRotateArray(int a[]) {
        int temp = a[0];
        System.out.println(temp);
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
            if (i == a.length - 1)
                a[i] = temp;
        }
        return a;
    }

    // 6. Rotate array to right by K
    // Brute Force ~
    public static int[] RotatetorightbyK(int[] arr, int n, int k) {
        if (n == 0)
            return new int[0];

        if (k > n)
            k = k % n;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    // Optimal Approach ~
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] RotateeletoleftbyK(int[] arr, int n, int k) {
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
        Reverse(arr, 0, n - 1);

        return arr;
    }

    // 7. Move zeros to end
    // Optimal Approach ~
    public static int[] moveZerostoEnd(int[] a, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return a;

        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {

                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }

    // 8. Linear Search an element
    public static int linearSearchArr(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            if (k == a[i])
                return i;
        }
        return -1;
    }





    // 9. Find the missing number in an array
    // Optimal Approach ~
    public static int missingNumArr(int a[]){
        int sum1 = (a[a.length-1]*(a[a.length-1]+1))/2;
        for(int i = 0; i < a.length ; i++)
            sum1 -= a[i];
        return sum1;
    }





    // 10. Count maximmum Consecutive 1s in an array
    public static int maxCons1sArr(int a[]){
        int c = 0;
        int max = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 1)
                c++;
            else
                c = 0;
            max = Math.max(c,max);
        }
        return max;
    }





    // 11. Union of two sorted arrays
    // Brute force ~
    public static ArrayList<Integer> unionArrBrute(int a[], int b[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        // HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        // for (int i = 0; i < a.length; i++) {
        //     hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        // }
        // for (int i = 0; i < b.length; i++) {
        //     hm.put(b[i],hm.getOrDefault(b[i],0)+1);

        // }
        // for(int ele : hm.keySet())
        // al.add(ele);

        // return al;

        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) 
            hs.add(a[i]);
        for (int i = 0; i < b.length; i++) 
            hs.add(b[i]);
        for(int ele : hs)
        al.add(ele);

        return al;
    }
    // Optimal Approach ~
    public static ArrayList<Integer> unionArrOptimal(int a[], int b[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = a.length; int m = b.length;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(a[i]<=b[j]){
                if(al.size() == 0 || al.get(al.size()-1) != a[i])
                    al.add(a[i]);
                i++;
            }
            else{
                if(al.size() == 0 || al.get(al.size()-1) != b[j])
                    al.add(b[j]);
                j++;
            }
        }
            while (i < n) 
            {
              if (al.get(al.size()-1) != a[i])
                al.add(a[i]);
              i++;
            }
            while (j < m) 
            {
              if (al.get(al.size()-1) != b[j])
                al.add(b[j]);
              j++;
            }
          
          return al;
        }






        // 12. Find the element appearing once in an array
        // Better Approach ~ (Using Hashing)
        // Optimal Approach ~
        public static int findSingleElement(int a[]){
            int xor = 0;
            for (int i = 0; i < a.length; i++) 
                xor ^=a[i];
            return xor;
        }




        // 13. Longest subarray of sum K
        public static int getLongestSubarray(int []a, long k) {
            int n = a.length; 
    
            int left = 0, right = 0; 
            long sum = a[0];
            int maxLen = 0;
            while (right < n) {
                while (left <= right && sum > k) {
                    sum -= a[left];
                    left++;
                }
    
                
                if (sum == k) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
    
            
                right++;
                if (right < n) sum += a[right];
            }
    
            return maxLen;
        }
    }



