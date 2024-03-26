import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {
    public static void main(String[] args) {
        String text = "Contact us at email@example.com or support@example.org for assistance.";

        // Define the regex pattern for an email address
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find and print all email addresses
        while (matcher.find()) {
            System.out.println("Email found: " + matcher.group());
        }
    }
}
