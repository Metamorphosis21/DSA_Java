
public class EasyMediumStrings {
    public static void main(String[] args) {
        // String S = "(()())(()())";
        // System.out.println(removeOutermostParenthesis(S));

        String s = "The sky is blue";
        System.out.println(checkPalindrome(s));
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

    static String checkPalindrome(String s){
        return s.trim();
    }
}
