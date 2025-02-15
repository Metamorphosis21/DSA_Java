
public class EasyMediumStrings {
    public static void main(String[] args) {
        // String S = "(()())(()())";
        // System.out.println(removeOutermostParenthesis(S));

        // String s = "The sky       is blue";
        // System.out.println(checkPalindrome(s));
        // checkPalindrome(s);

        
    }


    // static String removeOutermostParenthesis(String S){
    //     int cnt = 0;
    //     String prt = "";
    //     for(int i = 0; i < S.length(); i++){
    //         if(S.charAt(i) == ')') cnt--;
    //         if(cnt!=0) prt+=S.charAt(i);
    //         if(S.charAt(i) == '(') cnt++;
    //     }

    //     StringBuilder sb = new StringBuilder();
    //     for (char ch : S.toCharArray()) {
    //         if((ch == '(' && cnt++ > 0) || (ch == ')' && cnt-- > 1))
    //             sb.append(ch);
    //     }
    //     return sb.toString();
    // }

    // static String checkPalindrome(String s){
        // String s_arr[] = s.trim().split(" ");
        // String newstr = "";
        // for(int i = s_arr.length-1; i >= 0; i--){
        //     newstr += s_arr[i]+" ";
        // }
        // System.out.println(Arrays.toString(s_arr));
        // System.out.println(newstr);       
        
        // StringBuilder sb = new StringBuilder();
        // String s_arr[] = s.replaceAll("\\s+", " ").split(" ");
        // for(int i = s_arr.length - 1; i >= 0; i--){
        //     sb.append(s_arr[i]);
        //     if(i>0)sb.append(" ");
        // }
        // return sb.toString();
    // }


}
