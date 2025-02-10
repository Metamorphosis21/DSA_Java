import java.util.regex.*;

public class String_Learn {
    public static void main(String[] args) {
        // 1. Length of a string
        String str = "Hello, Java!";
        System.out.println("Length: " + str.length());
        
        // 2. Convert to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // 3. Substring
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring (0,5): " + str.substring(0, 5));
        
        // 4. Character at index
        System.out.println("Character at index 1: " + str.charAt(1));
        
        // 5. String comparison
        String str1 = "Java";
        String str2 = "JAVA";
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));
        
        // 6. Check if contains substring
        System.out.println("Contains 'Java': " + str.contains("Java"));
        
        // 7. Replace characters
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
        
        // 8. Split string
        String fruits = "apple,banana,grape";
        String[] fruitArray = fruits.split(",");
        for (String fruit : fruitArray) {
            System.out.println("Fruit: " + fruit);
        }
        
        // 9. Trim whitespace
        String trimStr = "   Java   ";
        System.out.println("Trimmed: " + trimStr.trim());
        
        // 10. Join strings
        System.out.println("Joined: " + String.join("-", "Java", "is", "cool"));
        
        // 11. Convert to char array
        char[] chars = str.toCharArray();
        System.out.print("Char array: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        // 12. Convert other data types to string
        int num = 100;
        System.out.println("String value of 100: " + String.valueOf(num));
        
        // 13. Concatenation
        System.out.println("Concatenation: " + str1.concat(str2));
        
        // 14. StartsWith & EndsWith
        System.out.println("Starts with 'Java': " + str1.startsWith("Java"));
        System.out.println("Ends with 'Script': " + str1.endsWith("Script"));
        
        // 15. Is Empty
        String emptyStr = "";
        System.out.println("Is Empty: " + emptyStr.isEmpty());
        
        // 16. Index of character/substring
        System.out.println("Index of 'g' in 'Programming': " + "Programming".indexOf('g'));
        System.out.println("Last index of 'g': " + "Programming".lastIndexOf('g'));
        
        // 17. Format string
        System.out.println(String.format("My name is %s and I am %d years old.", "John", 25));
        
        // ********** REGEX FUNCTIONS **********
        
        // 1. matches() - Check entire string
        System.out.println("Matches regex: " + str.matches("[A-Za-z, !]+"));
        
        // 2. replaceAll() - Replace using regex
        System.out.println("Replace digits: " + "hello123world".replaceAll("[0-9]", "*"));
        
        // 3. replaceFirst() - Replace only first match
        System.out.println("Replace first digit: " + "hello123world".replaceFirst("[0-9]", "*"));
        
        // 4. split() - Split based on regex
        String data = "Java1Python2C++3";
        String[] languages = data.split("[0-9]");
        for (String lang : languages) {
            System.out.println("Language: " + lang);
        }
        
        // 5. Using Pattern and Matcher for advanced regex
        Pattern pattern = Pattern.compile("[a-z]+[0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("hello123");
        System.out.println("Pattern matches: " + matcher.matches());
    }
}
