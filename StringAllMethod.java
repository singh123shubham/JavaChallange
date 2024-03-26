import java.util.Locale;

public class StringAllMethod {
    public static void main(String[] args) {
        // Example strings
        String str1 = "Hello, world!";
        String str2 = "Java is awesome";
        
        // char charAt(int index)
        char ch = str1.charAt(0);
        System.out.println("Character at index 0 in str1: " + ch);
        
        // int length()
        int len = str1.length();
        System.out.println("Length of str1: " + len);
        
        // static String format(String format, Object... args)
        String formattedString = String.format("Length of '%s' is %d", str1, len);
        System.out.println("Formatted String: " + formattedString);
        
        // static String format(Locale l, String format, Object... args)
        String formattedStringWithLocale = String.format(Locale.US, "Length of '%s' is %d", str1, len);
        System.out.println("Formatted String with Locale: " + formattedStringWithLocale);
        
        // String substring(int beginIndex)
        String sub = str1.substring(7);
        System.out.println("Substring of str1 from index 7: " + sub);
        
        // String substring(int beginIndex, int endIndex)
        String sub2 = str2.substring(0, 4);
        System.out.println("Substring of str2 from index 0 to 4: " + sub2);
        
        // boolean contains(CharSequence s)
        boolean contains = str1.contains("world");
        System.out.println("Does str1 contain 'world'? " + contains);
        
        // static String join(CharSequence delimiter, CharSequence... elements)
        String joinedString = String.join("-", "Welcome", "to", "Java");
        System.out.println("Joined String: " + joinedString);
        
        // boolean equals(Object another)
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);
        
        // boolean isEmpty()
        boolean empty = str1.isEmpty();
        System.out.println("Is str1 empty? " + empty);
        
        // String concat(String str)
        String concatenated = str1.concat(" Have a nice day!");
        System.out.println("Concatenated String: " + concatenated);
        
        // String replace(char old, char new)
        String replaced = str1.replace('o', '0');
        System.out.println("Replaced String: " + replaced);

        // String[] split(String regex)
        String[] words = str1.split("\\s+"); // Split by whitespace
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.print(word);
        }
          // static String equalsIgnoreCase(String another)
          String str3 = "hello";
          String str4 = "HELLO";
          boolean isEqualIgnoreCase = str3.equalsIgnoreCase(str4);
          System.out.println("Are str1 and str2 equal ignoring case? " + isEqualIgnoreCase);
        
        
    }
}
