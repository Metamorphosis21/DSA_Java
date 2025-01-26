public class BasicMaths {
    public static void main(String[] args) {

        // 1. Count digits in a number

        // Brute Force  ~
        // int num = 1234343435;
        // int c = 0;
        // while (num!=0){
        //     num /= 10;
        //     c++;
        // }
        // System.out.println("Count: " + c);

        // Optimal Approach ~
        // int num = 12345;
        // int c = (int) Math.log10(num) + 1;
        // System.out.println("Count: "+c);



        // 2. Reverse a number

        // Optimal Approach ~
        // int num = 12345;
        // int rev = 0;
        // while(num > 0){
        //     rev = rev * 10 + num % 10;
        //     num /= 10;
        // }
        // System.out.println("Reverse number: "+rev);



        // 3. Check for Palindrome

        // Brute Force ~
        // int num = 1221;
        // String snum = ""+num;
        // for(int i = 0; i < snum.length(); i++){
        //         if (snum.charAt(i) != snum.charAt(snum.length() - i - 1))
        //            System.out.println("Not a palindrome");
        //         }
        // System.out.println("Palindrome");

        // Optimal Approach ~
        // (reverse and check with the original number)



        // 4. Armstrong number 

        // Optimal Approach ~
        // int num = 153;
        // int c = (""+num).length();
        // int armnum = 0;
        // while(num != 0){
        //     armnum += (int) Math.pow(num % 10,c);
        //     System.out.println(armnum);
        //     num /= 10;
        // }
        // if(armnum == 153)
        //     System.out.println("True Armstrong number");
        // else
        //     System.out.println("False Armstrong number");



        // 5. Check for prime ~

        // Optimal Approach ~
        // int num = 7;
        // int c = 0;
        // for(int i = 1; i <= Math.sqrt(num); i++){
        //     if(num % i == 0){
        //         c++;
                
        //         if(num / i != i)
        //         c++;
        //     }
            
        // }
        // if(c == 2)
        // System.out.println("Prime number");
        // else
        // System.out.println("Not a prime number");
        
    }
}
