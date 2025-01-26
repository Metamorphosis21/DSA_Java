public class AllPatterns{
    public static void main(String[] args) {
        // 1. 
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 2.
        // for (int i = 0; i <= 5; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 3.
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(j+1);
        //     }
        //     System.out.println();
        // }

        // 4. 
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(i+1);
        //     }
        //     System.out.println();
        // }

        // 5.
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 5; j > i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 6. 
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 5; j > i; j--) {
        //         System.out.print(5-j+1);
        //     }
        //     System.out.println();
        // }

        // 7. 
        // int c=1;
        // for (int i = 0; i < 5; i++) { 
        //     for (int k = 5; k > i; k--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i+c; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     c++;
        // }

        // 8. 
        // int N=5;
        // int c=1;
        // for (int i = 0; i < N; i++) { 
        //     for (int k = 0; k < i; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = N+(N-1); j >= i+c; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     c++;
        // }

        // 9. 
        // int N=5;
        // int c=1;
        // for (int i = 0; i < N; i++) { 
        //     for (int k = N; k > i; k--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i+c; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     c++;
        // }
        // N=5;
        // c=1;
        // for (int i = 0; i < N; i++) { 
        //     for (int k = 0; k <= i; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = N+(N-1); j >= i+c; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     c++;
        // }

        // 11.
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 0; j < i; j++) {
        //         if((i+j)%2 == 0)
        //         System.out.print("0 ");
        //         else
        //         System.out.print("1 ");
        //     }
        //     System.out.println();
        // }

        // 12.
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(j+1);
        //     }
        //     for(int k = 4;k > i;k--){
        //         System.out.print("  ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(i+1-j);
        //     }
        //     System.out.println();
        // }

        // 13.
        // int x=1;
        // for (int i = 0; i <= 5; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(x++ + " ");
        //     }
        //     System.out.println();
        // }

        // 17.
        // int c=1;
        // for (int i = 0; i < 5; i++) { 
        //     for (int k = 5; k > i; k--) {
        //         System.out.print(" ");
        //     }
        //     char ch = 'A';
        //     int bp = (2*i+1)/2;
        //     for(int j=1;j<=i+c;j++){ 
        //         System.out.print(ch);
        //         if(j <= bp) ch++;
        //         else ch--;
        //     }
        //     System.out.println();
        //     c++;
        // }

        // 18.
        // int S=0;
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 1; j <= 5-i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int k = 0; k < S; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 5-i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     S+=2;
        // }
        
        // for (int i = 0; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int k = 0; k < S; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     S-=2;
        // }

        // 22.
        // int N=5;
        // for (int i = 0; i < 2*N-1; i++) {
        //     for (int j = 0; j < 2*N-1; j++) {
        //         int top = i;
        //         int bottom = j;
        //         int right = (2*N - 2) - j;
        //         int left = (2*N - 2) - i;

        //         System.out.print(N - Math.min(Math.min(top,bottom), Math.min(left,right)) + "  ");
        //     }
        //     System.out.println();
        // }
    }
}