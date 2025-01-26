import java.util.Arrays;

public class BasicRecursion{
    public static void main(String[] args) {
        
        // RecName("Zululu",5);

        // RecNum(5);

        // RecNumReverse(5);

        // System.out.println("Sum: "+RecSum2(5));

        // System.out.println("Factorial: "+RecFact2(5));

        // int arr[] = {1,2,3,4,5};
        // RecReverseArray(arr, 0, arr.length - 1);
        // System.out.println("Reverse array: "+ Arrays.toString(arr));

        // String palStr = "lelslel" ;
        // System.out.println("Is palindrome: "+ RecIsPalindromeString(palStr, 0, palStr.length() - 1));

        // printFibonacciSeries(5);

    }
    
    // 1. Print name N times using recursion
    static void RecName(String name, int N){
            if (N == 0)
            return;
            System.out.println(name);
            RecName(name, N-1);
    }

    // 2. Print 1 to N using recursion
    static int c = 1;
    static void RecNum(int N){  
        if (c > N)
        return;
        System.out.print(c++ +" - ");
        RecNum(N);
    }

    // 3. Print N to 1 using recursion
    static void RecNumReverse(int N){
        if (N == 0)
        return;
        System.out.print(N+" - ");
        RecNumReverse(N-1);
    }

    // 4. Sum of N numbers using recursion
    static int sum = 0;
    static int RecSum(int N){
        if (N == 0)
        return sum;
        sum += N;
        return RecSum(N-1);
    }

    static int RecSum2(int N){
        if (N == 0)
        return 0;
        return N + RecSum2(N-1);
    }

    // 5. Factorial of N numbers using recursion
    static int fact = 1;
    static int RecFact(int N){
        if (N == 0)
        return fact;
        fact *= N;
        return RecFact(N-1);
    }

    static int RecFact2(int N){
        if (N == 0)
        return 1;
        return N * RecFact2(N - 1);
    }

    // 6. Reverse an array using recursion
    static void RecReverseArray(int arr[], int start, int end){
        if(end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            RecReverseArray(arr, start+1, end-1);
        }
    }

    // 7. Check for palindrome using recursion
    static boolean RecIsPalindromeString(String str, int start, int end){
        if(start < end){
            if(str.charAt(start) != str.charAt(end))
            return false;
            return RecIsPalindromeString(str, start+1, end-1);
        }
        return true;
    }

    // 8. Print the Fibonacci series up to the Nth term using recursion
    static void printFibonacciSeries(int N) {
        for (int i = 0; i <= N; i++) {
            System.out.print(RecFibonacciSeries(i) + " ");
        }
    }
    static int RecFibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return RecFibonacciSeries(n - 1) + RecFibonacciSeries(n - 2);
    }

}