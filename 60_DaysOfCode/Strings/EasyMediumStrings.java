// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

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

    // public String largestOddNumber(String num) {
    //     for (int i = num.length() - 1; i >= 0; i--) {  
    //         if ((num.charAt(i) - '0') % 2 != 0) {  
    //             return num.substring(0, i + 1);  
    //         }
    //     }
    //     return "";  
    // }

    // public String longestCommonPrefix(String[] strs) {
    //     Arrays.sort(strs);
    //     String s1 = strs[0];
    //     String s2 = strs[strs.length - 1];
    //     int i;
    //     for(i = 0; i < s1.length(); i++){
    //         if(s1.charAt(i)!=s2.charAt(i))
    //             break;
    //     }
    //     return s1.substring(0,i);
    // 
    //     String s = strs[0];
    //     for(int i = 1; i < strs.length; i++){
    //         while(strs[i].indexOf(s) != 0){
    //             s = s.substring(0 , s.length()-1);
    //             if(s.length() == 0)
    //                 return "";
    //         }
    //     }
    //     return s;
    // }

    //     public boolean isIsomorphic(String s, String t) {
    //     HashMap<Character, Character> charMap = new HashMap<>();

    //     for (int i = 0; i < s.length(); i++) {
    //         char sc = s.charAt(i);
    //         char tc = t.charAt(i);

    //         if (charMap.containsKey(sc)) {
    //             if (charMap.get(sc) != tc) {
    //                 return false;
    //             }
    //         } else if (charMap.containsValue(tc)) {
    //             return false;
    //         }

    //         charMap.put(sc, tc);
    //     }

    //     return true;        
    // }

    // public boolean rotateString(String s, String goal) {
    //     if(s.length()!=goal.length())
    //         return false;
    //     return (s+s).contains(goal);

    // }

    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) return false;
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1, arr2);

    //     Map<Character,Integer> hm = new HashMap<>();
    //     for(char c:s.toCharArray()){
    //         hm.put(c,hm.getOrDefault(c,0)+1);
    //     }

    //     for(char c:t.toCharArray()){
    //         if(!hm.containsKey(c)) return false;
    //         hm.put(c,hm.get(c)-1);
    //         if(hm.get(c)==0) hm.remove(c);
    //     }
    // return hm.isEmpty();
    // }

    // public String frequencySort(String s) {
    //     Map<Character,Integer> hm = new HashMap<>();
    //     for(char c:s.toCharArray()){
    //         hm.put(c,hm.getOrDefault(c,0)+1);
    //     }
    //     System.out.println(hm);
    //     List<Map.Entry<Character,Integer>> hl = new ArrayList<>(hm.entrySet());
    //     hl.sort((a,b)->b.getValue().compareTo(a.getValue()));
    //     System.out.println(hl);
    //     StringBuilder res = new StringBuilder();
    //     for(Map.Entry<Character,Integer> ele : hl){
    //         res.append(String.valueOf(ele.getKey()).repeat(ele.getValue()));
    //     }

    //     return res.toString();
    // }

    // public int maxDepth(String s) {
    //     int cnt = 0; int k = 0;
    //     for(char c:s.toCharArray()){
    //         if(c=='(')
    //             cnt++;
    //         else if(c==')')
    //             cnt--;
    //         else
    //             continue;
    //         k = Math.max(cnt,k);
    //     }
    //     return k;
    // }

    // public int romanToInt(String s) {
    //     Map<Character, Integer> hm = new HashMap<>();
    //     hm.put('I', 1);
    //     hm.put('V', 5);
    //     hm.put('X', 10);
    //     hm.put('L', 50);
    //     hm.put('C', 100);
    //     hm.put('D', 500);
    //     hm.put('M', 1000);
    //     int res = 0;

    //     for(int i=0;i<s.length()-1;i++){
    //         if(hm.get(s.charAt(i))>=hm.get(s.charAt(i+1)))
    //             res+=hm.get(s.charAt(i));
    //         else
    //             res-=hm.get(s.charAt(i));
    //     }
    //     return res + hm.get(s.charAt(s.length() - 1));        
    // }

    // public String reverseWords(String s) {
    //     String[] words = s.trim().split("\\s+");
    //     StringBuilder sb = new StringBuilder();

    //     for (int i = words.length - 1; i > 0; i--) {
    //         sb.append(words[i]);
    //         sb.append(" ");
    //     }
    //     sb.append(words[0]);

    //     return sb.toString();
    // }
}
