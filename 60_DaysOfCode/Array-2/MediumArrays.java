import java.util.*;

public class MediumArrays {
	public static void main(String[] args) {
		// int arr[] = { 2, 1, 5, -4, -1, 4, 6 };
		// Arrays.sort(arr);
		// int n = arr.length;
		// int target = 14;
		// System.out.println(twoSum(arr, n, target));
		// System.out.println(Arrays.toString(sortZerOneTwo(arr, n)));
		// System.out.println(majorityElement(arr,n));
		// System.out.println(kandaneSubarray(arr, n));
		// System.out.println(buySellStock(arr, n));
		// System.out.println(LeaderElementtoRight(arr, n));
		// System.out.println(subarraywithsumK(arr, n, 4));
		// System.out.println(Arrays.toString(rearrangeArray(arr)));
		// System.out.println(Arrays.toString(nextPermutation(arr, n)));
		// System.out.println(longestConsecutive(arr));

		// ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		// matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
		// matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
		// matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
		// int n = matrix.size();
		// int m = matrix.get(0).size();
		// ArrayList<ArrayList<Integer>> ans1 = setZeros(matrix, n, m);
		// ArrayList<ArrayList<Integer>> ans2 = optimalsetZeros(matrix, n, m);
		// System.out.println("The Final matrix is: ");
		// for (ArrayList<Integer> row : ans1) {
		// for (Integer ele : row) {
		// System.out.print(ele + " ");
		// }
		// System.out.println();
		// }

		// int arr[][] = { { 1, 2, 3 },
		// { 4, 5, 6 },
		// { 7, 8, 9 } };
		// rotate90(arr);
		// System.out.println("Rotated Image");
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr.length; j++) {
		// System.out.print(arr[i][j] + " ");
		// }
		// System.out.println();
		// }

		// System.out.println(spiralMatrix(arr, arr.length, arr[0].length));

		// int r = 5;
		// int c = 3;
		// System.out.println("The element at position (r,c) is: " +
		// pascalTriangleRowColElement(r, c));
		// int n = 6;
		// pascalTriangleNRow(n);
		// int n = 3;
		// System.out.println(pascalTriangle(n));

		// System.out.println(largestSubarraywithSum0(arr));

		int nums[] = {3,2,3};
		System.out.println(majorityElementn3(nums));

	}

	// 1. Two Sum
	// static boolean twoSum(int a[] , int n, int k){
	// BruteForce ~ o(N^2)
	// int sum;for(
	// int i = 0;i<n;i++)
	// {
	// 	for (int j = i + 1; j < n; j++) {
	// 		sum = a[i] + a[j];
	// 		if (sum == k)
	// 			return new int[] { i, j };
	// 		sum = 0;
	// 	}
	// }return new int[]{};

	// Using HashMap ~ O(n)
	// HashMap<Integer , Integer> hmp = new HashMap<>();for(
	// int i = 0;i<n;i++)
	// {
	// 	int num1 = a[i];
	// 	int num2 = k - num1;
	// 	if (hmp.containsKey(num2)) {
	// 		return true;
	// 	}
	// 	hmp.put(a[i], i);
	// }return false;

	// Using twopointer ~ O(n) + O(n log n)
	// Arrays.sort(a);

	// int left = 0, right = n - 1;while(left<right)
	// {
	// 	if (a[left] + a[right] == k)
	// 		return true;
	// 	else if (a[left] + a[right] < k)
	// 		left++;
	// 	else
	// 		right--;
	// }return false;
	// }

	// 2. Sort array of [0s, 1s, 2s] without using inbuilt functions
	// static int[] sortZerOneTwo(int a[], int n) {
	// Better Approach ~ O(2n)
// 	int n0 = 0;
// 	int n1 = 0;
// 	int n2 = 0;
// 	for (int i = 0; i < n; i++) {
// 		if (a[i] == 0)
// 			n0++;
// 		else if (a[i] == 1)
// 			n1++;
// 		else
// 			n2++;
// 	}
// 	for (int i = 0; i < n; i++) {
// 		if (i >= 0 && i < n0)
// 			a[i] = 0;
// 		else if (i >= n0 && i < n0 + n1)
// 			a[i] = 1;
// 		else if (i >= n0 + n1 && i < n0 + n1 + n2)
// 			a[i] = 2;
// 	}
// 	return a;
// }

	// Optimal Approach ~ O(n) [ Dutch National flag algorithm. ]
	// int low = 0;
	// int mid = 0;
	// int high = n-1;while(mid<=high)
	// {
	// 	if (a[mid] == 0) {
	// 		int temp = a[low];
	// 		a[low] = a[mid];
	// 		a[mid] = temp;
	// 		low++;
	// 		mid++;
	// 	} else if (a[mid] == 1) {
	// 		mid++;
	// 	} else {
	// 		int temp = a[mid];
	// 		a[mid] = a[high];
	// 		a[high] = temp;
	// 		high--;
	// 	}
	// }return a;
	// }

	// 3. Return number that appears more than n/2 times in an array
	// static int majorityElement(int v[],int n) {
	// Optimal solution ~ O(2n) [ Moore’s Voting Algorithm ]
	// int cnt = 0;
	// int el = 0;for(
	// int i = 0;i<n;i++)
	// {
	// 	if (cnt == 0) {
	// 		cnt = 1;
	// 		el = v[i];
	// 	} else if (el == v[i])
	// 		cnt++;
	// 	else
	// 		cnt--;
	// }
	// int cnt1 = 0;for(
	// int i = 0;i<n;i++)
	// {
	// 	if (v[i] == el)
	// 		cnt1++;
	// }

	// if(cnt1>(n/2))return el;return-1;
	// }

	// 4. Maximum subarray sum in array [ Kandane's Algorithm ]
	// static int kandaneSubarray(int a[] , int n){
	// Better Approach ~ O(n^2)
	// int maxSum = Integer.MIN_VALUE;
	// for (int i = 0; i < n; i++) {
	// 	int sum = 0;
	// 	for (int j = i; j < n; j++) {
	// 		sum += a[j];
	// 		if (maxSum < sum)
	// 			maxSum = sum;
	// 	}
	// }
	// return maxSum;
	// }

	// Optimal Approach ~ O(n)
	// int maxSum = Integer.MIN_VALUE;
	// int sum = 0;
	// int start = -1;
	// int aStart = -1, aEnd = -1;for(
	// int i = 0;i<n;i++)
	// {
	// 	if (sum == 0)
	// 		start = i;
	// 	sum += a[i];
	// 	if (sum > maxSum) {
	// 		aStart = start;
	// 		aEnd = i;
	// 		maxSum = sum;
	// 	}
	// 	if (sum < 0)
	// 		sum = 0;
	// }return maxSum;
	// }

	// 5. Buy and sell stock with max profit - O(n)
	// static int buySellStock(int a[], int n) {
	// 	int min = a[0];
	// 	int profit = 0;
	// 	int buyDay = 0;
	// 	int sellDay = 0;
	// 	for (int i = 1; i < n; i++) {
	// 		if (a[i] < min) {
	// 			min = a[i];
	// 			buyDay = i + 1;
	// 		}
	// 		if (a[i] - min > profit) {
	// 			profit = a[i] - min;
	// 			sellDay = i + 1;
	// 		}
	// 	}
	// 	System.out.println("Buy: " + buyDay + " - Sell: " + sellDay);
	// 	return profit;
	// }

	// 6. Leader elment to all the elements to the right sid1e of it
	// static ArrayList<Integer> LeaderElementtoRight(int a[], int n) {
	// 	ArrayList<Integer> list = new ArrayList<>();
	// 	int leader = a[n - 1];
	// 	list.add(leader);
	// 	for (int i = n - 2; i >= 0; i--) {
	// 		if (a[i] > leader) {
	// 			leader = a[i];
	// 			list.add(leader);
	// 		}
	// 	}
	// 	return list;
	// }

	// 7. Find number of subarrays with sum K
	// static int subarraywithsumK(int a[], int n, int k) {
	// 	Map<Integer, Integer> mp = new HashMap<>();
	// 	int preSum = 0;
	// 	int cnt = 0;
	// 	mp.put(0, 1);
	// 	for (int i = 0; i < n; i++) {
	// 		preSum += a[i];
	// 		int remove = preSum - k;
	// 		cnt += mp.getOrDefault(remove, 0);
	// 		mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);
	// 	}
	// 	return cnt;
	// }

	// 8. Reaarange arry elements by sign (having same no. of +ves and -ves)
	// static int[] rearrangebySign(int a[] , int n){
	// Brute Force ~
	// ArrayList<Integer> pos = new ArrayList<>();
	// ArrayList<Integer> neg = new ArrayList<>();

	// 	for (int i = 0; i < n; i++) {
	// 		if(a[i] > 0)
	// 			pos.add(a[i]);
	// 		else
	// 			neg.add(a[i]);
	// 	}

	// 	for (int i = 0; i < n/2; i++) {
	// 		a[2*i] = pos.get(i);
	// 		a[2*i+1] = neg.get(i);
	// 	}

	// return a;

	// Optimal Approach ~
	// int reArray[] = new int[n];
	// int pos = 0;
	// int neg = 1;for(
	// int i = 0;i<n;i++)
	// {
	// 	if (a[i] > 0) {
	// 		reArray[pos] = a[i];
	// 		pos += 2;
	// 	} else {
	// 		reArray[neg] = a[i];
	// 		neg += 2;
	// 	}
	// }

	// return reArray;

	// (having different+ves and-ves)if(a==null||n==0)
	// {
	// 	return a;
	// }

	// ArrayList<Integer> pos = new ArrayList<>();
	// ArrayList<Integer> neg = new ArrayList<>();

	// for(
	// int i = 0;i<n;i++)
	// {
	// 	if (a[i] > 0)
	// 		pos.add(a[i]);
	// 	else
	// 		neg.add(a[i]);
	// }System.out.println(pos);System.out.println(neg);

	// int pv = 0;
	// int nv = 0;
	// int newP = 0;while(pv<pos.size()&&nv<neg.size())
	// {
	// 	a[2 * newP] = pos.get(pv++);
	// 	a[2 * newP + 1] = neg.get(nv++);
	// 	newP++;
	// }return a;
	// }

	// 9. Next permutation
	// static int[] nextPermutation(int a[], int n) {
	// 	int index = -1;
	// 	for (int i = n - 2; i >= 0; i--) {
	// 		if (a[i] < a[i + 1]) {
	// 			index = i;
	// 			break;
	// 		}
	// 	}
	// 	if (index == -1) {
	// 		int start = 0;
	// 		int end = n - 1;
	// 		while (start < end) {
	// 			int temp = a[start];
	// 			a[start] = a[end];
	// 			a[end] = temp;
	// 			start++;
	// 			end--;
	// 		}
	// 		return a;
	// 	}

	// 	for (int i = n - 1; i >= index; i--) {
	// 		if (a[i] > a[index]) {
	// 			int temp = a[i];
	// 			a[i] = a[index];
	// 			a[index] = temp;

	// 			break;
	// 		}
	// 	}
	// 	int start = index + 1;
	// 	int end = n - 1;
	// 	while (start < end) {
	// 		int temp = a[start];
	// 		a[start] = a[end];
	// 		a[end] = temp;
	// 		start++;
	// 		end--;
	// 	}
	// 	return a;
	// }

	// 10. Longest consecutive sequence
	// static int longestConsecutive(int[] nums) {
    //     if(nums.length == 0)
    //     return 0;
    //     Set<Integer> hst = new HashSet<>();
    //     int lg = 1;
    //     for(int i = 0; i < nums.length ; i++)
    //         hst.add(nums[i]);
    //     for(int ele : hst){
    //         if(!hst.contains(ele-1)){
    //             int cnt = 1; int x = ele;
    //             while(hst.contains(x+1)){
    //                 x = x+1;
    //                 cnt++;
    //             }
    //             lg = Math.max(lg , cnt);
    //         }
    //     }
    //     return lg;
    // }

	// 11. Set matrix 0
	// ~ Better Approach -
	// static ArrayList<ArrayList<Integer>> setZeros(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
	// 	int row[] = new int[n];
	// 	int col[] = new int[m];
	// 	for (int i = 0; i < n; i++) {
	// 		for (int j = 0; j < m; j++) {
	// 			if (matrix.get(i).get(j) == 0) {
	// 				row[i] = 1;
	// 				col[j] = 1;
	// 			}
	// 		}
	// 	}
	// 	for (int i = 0; i < n; i++) {
	// 		for (int j = 0; j < m; j++) {
	// 			if (row[i] == 1 || col[j] == 1)
	// 				matrix.get(i).set(j, 0);
	// 		}
	// 	}
	// 	return matrix;
	// }

	// ~ Optimal Appraoch - 
	// static ArrayList<ArrayList<Integer>> optimalsetZeros(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
    //     int col0 = 1;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if (matrix.get(i).get(j) == 0) {
    //                 // mark i-th row:
    //                 matrix.get(i).set(0, 0);

    //                 // mark j-th column:
    //                 if (j != 0)
    //                     matrix.get(0).set(j, 0);
    //                 else
    //                     col0 = 0;
    //             }
    //         }
    //     }
    //     for (int i = 1; i < n; i++) {
    //         for (int j = 1; j < m; j++) {
    //             if (matrix.get(i).get(j) != 0) {
    //                 // check for col & row:
    //                 if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
    //                     matrix.get(i).set(j, 0);
    //                 }
    //             }
    //         }
    //     }
    //     if (matrix.get(0).get(0) == 0) {
    //         for (int j = 0; j < m; j++) {
    //             matrix.get(0).set(j, 0);
    //         }
    //     }
    //     if (col0 == 0) {
    //         for (int i = 0; i < n; i++) {
    //             matrix.get(i).set(0, 0);
    //         }
    //     }
    //     return matrix;
    // }

	// 12. Rotate matrix by 90 degree
	// static void rotate90(int[][] matrix) {
    //     for(int i = 0 ; i < matrix.length ; i++){
    //         for(int j = i; j < matrix.length ; j++){
    //             if(i!=j){
    //                 int temp = matrix[i][j];
    //                 matrix[i][j] = matrix[j][i];
    //                 matrix[j][i] = temp;
    //             }
    //         }
    //     }
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix.length / 2; j++) {
    //             int temp = 0;
    //             temp = matrix[i][j];
    //             matrix[i][j] = matrix[i][matrix.length - 1 - j];
    //             matrix[i][matrix.length - 1 - j] = temp;
    //         }
    //     }
    // }

	// 13. Spiral matrix
	// static ArrayList<Integer> spiralMatrix(int matrix[][], int n, int m) {
	// 	ArrayList<Integer> spiral = new ArrayList<Integer>();
	// 	int left = 0;
	// 	int right = m - 1;
	// 	int top = 0;
	// 	int bottom = n - 1;
	// 	while (top <= bottom && left <= right) {
	// 		for (int i = left; i <= right; i++) {
	// 			spiral.add(matrix[top][i]);
	// 		}
	// 		top++;
	// 		for (int i = top; i <= bottom; i++) {
	// 			spiral.add(matrix[i][right]);
	// 		}
	// 		right--;
	// 		if (top <= bottom) {
	// 			for (int i = right; i >= left; i--) {
	// 				spiral.add(matrix[bottom][i]);
	// 			}
	// 			bottom--;
	// 		}
	// 		if (left <= right) {
	// 			for (int i = bottom; i >= top ; i--) {
	// 				spiral.add(matrix[i][left]);
	// 			}
	// 			left++;
	// 		}
	// 	}
	// 	return spiral;
	// }

	// 14. Pascal Triangle - 3 varations
	// Variation 1 - return single element at postion (given row , column)
	// static long nCr(int n, int r) {
    //     long res = 1;
    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
    //     }
    //     return res;
    // }
    // static int pascalTriangle(int r, int c) {
    //     int element = (int) nCr(r - 1, c - 1);
    //     return element;
    // }
	// // or ----------------------
	// static int pascalTriangleRowColElement(int row, int col) {
	// 	int n = row - 1; int r = col - 1;
    //     long res = 1;

    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
	// 		// res = (res * (n - i)) / (i + 1);

    //     }

    //     return (int) res;
    // }

	// Variation 2 - return the nth row
	// static void pascalTriangleNRow(int n){
	// 	int ans = 1;
	// 	System.out.print(ans+" - ");
	// 	for(int c = 1; c < n; c++){
	// 		ans = (ans * (n - c))/c;
	// 		System.out.print(ans+" - ");
	// 	}
	// }

	// Variation 3 - Print entire pascal triangle
	// static List<List<Integer>> pascalTriangle(int n){
	// 	List<List<Integer>> ans = new ArrayList<List<Integer>>();
	// 	for(int row = 1; row <= n; row++){
	// 		ans.add(pascalTriangleNRow(row));
	// 	}
	// 	return ans;
	// }
	// static List<Integer> pascalTriangleNRow(int n) {
	// 	int ele = 1;
	// 	List<Integer> ansRow = new ArrayList<Integer>();
	// 	ansRow.add(1);
	// 	for (int c = 1; c < n; c++) {
	// 		ele = (ele * (n - c)) / c;
	// 		ansRow.add(ele);
	// 	}
	// 	return ansRow;
	// }

	// 15. Largest Subarray with Sum 0
	// static int largestSubarraywithSum0(int arr[]) {
	// 	HashMap<Integer, Integer> hp = new HashMap<>();
	// 	int sum = 0, max = 0;
	// 	for (int i = 0; i < arr.length; i++) {
	// 		sum += arr[i];
	// 		if (sum == 0)
	// 			max = i + 1;
	// 		else {
	// 			if (hp.get(sum) != null)
	// 				max = Math.max(max, i - hp.get(sum));
	// 			else
	// 				hp.put(sum, i);
	// 		}
	// 	}
	// 	return max;
	// }

	//16. Maximum Product Subarray

	//17. Majority element (n/3)
	static List<Integer> majorityElementn3(int[] nums) {
        Integer mj1 = 0 ;Integer mj2 = 0;
        int c1 = 0; int c2 = 0;

        for (int num : nums) {
            if (num == mj1) {
                c1++;
            } else if (num == mj2) {
                c2++;
            } else if (c1 == 0) {
                mj1 = num;
                c1++;
            } else if (c2 == 0) {
                mj2 = num;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;

        for (int num : nums) {
            if (num == mj1) {
                c1++;
            } else if (num == mj2) {
                c2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        int n = nums.length;

        if (c1 > n / 3) {
            res.add(mj1);
        }
        if (c2 > n / 3) {
            res.add(mj2);
        }

        return res;        
    }

}
