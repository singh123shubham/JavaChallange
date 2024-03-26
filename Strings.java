import java.util.*;

public class Strings {
    
    public static void main(String agrs[]){

        // ?string decleration
        //String text = "hello";

        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // String  address = sc.nextLine();
        // int age = sc.nextInt();

        // System.out.println("name" + name + "address" + address + "age"+ age);

        //? concatenation
        // String firstName = "Shubham";
        // String lastName = "Singh";

        // String FullName = firstName +  " " + lastName;
        // String FullName1 = firstName.concat(lastName);
        // System.out.println(FullName1);
        
        //? uppercase and lower case conversion
        // String upperCase = FullName.toUpperCase();
        // String lowerCase = FullName.toLowerCase();
        // int length = FullName.length();

        // System.out.println(upperCase + "\n" + lowerCase + '\n' + length);

         // ?charAt
        // for(int i=0;i<length;i++){  
        //     System.out.println(firstName.charAt(i));
        // }

        //? compare
        String name1 = "Shubham";
        String name2 = "Shubham Singh";

        // s1 > s2 : +ve value
        // s1<s2 :-ve value
        // s1==s2: 0

        if(name1.compareTo(name2) == 0){
            System.out.println("String are Equal");
        }else{
            System.out.println("Stringa not equal");
        }

        //? conatin
        if(name2.contains(name1)){
            System.out.println(name1+" contains "+name2);
        }else{
            System.out.println(name1+ " doesnot contain "+name2);
        }

        //? Substring  beginIndex ,ending
        String sentence = "My Name is Shubham Singh";
        String newString = sentence.substring(7,sentence.length());
       
        System.out.println(newString);

        //? trim
        String  spaceName = "    Shubham Singh         ";
        System.out.println(spaceName.trim()+"\n");

        //? split
        String str ="This is a string example";
        String[] words = str.split(" ");

        for (String word : words) { 
            System.out.print(word +" ");    
        }


        //? reverse
        String  revStr = "Hello World!";
        String revString = "";
        for(int  i=revStr.length()-1;i>=0;i--)  {
            revString = revString + revStr.charAt(i);  
        }
        System.out.println(revString);
    }
}



// 1	char charAt(int index)	returns char value for the particular index
// 	2	int length()	returns string length
// 	3	static String format(String format, Object... args)	returns a formatted string.
// 	4	static String format(Locale l, String format, Object... args)	returns formatted string with given locale.
// 	5	String substring(int beginIndex)	returns substring for given begin index.
// 	6	String substring(int beginIndex, int endIndex)	returns substring for given begin index and end index.
// 	7	boolean contains(CharSequence s)	returns true or false after matching the sequence of char value.
// 	8	static String join(CharSequence delimiter, CharSequence... elements)	returns a joined string.
// 	9	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)	returns a joined string.
// 	10	boolean equals(Object another)	checks the equality of string with the given object.
// 	11	boolean isEmpty()	checks if string is empty.
// 	12	String concat(String str)	concatenates the specified string.
// 	13	String replace(char old, char new)	replaces all occurrences of the specified char value.
// 	14	String replace(CharSequence old, CharSequence new)	replaces all occurrences of the specified CharSequence.
// 	15	static String equalsIgnoreCase(String another)	compares another string. It doesn't check case.
// 	16	String[] split(String regex)	returns a split string matching regex.
// 	17	String[] split(String regex, int limit)	returns a split string matching regex and limit.
// 	18	String intern()	returns an interned string.
// 	19	int indexOf(int ch)	returns the specified char value index.
// 	20	int indexOf(int ch, int fromIndex)	returns the specified char value index starting with given index.
// 	21	int indexOf(String substring)	returns the specified substring index.
// 	22	int indexOf(String substring, int fromIndex)	returns the specified substring index starting with given index.
// 	23	String toLowerCase()	returns a string in lowercase.
// 	24	String toLowerCase(Locale l)	returns a string in lowercase using specified locale.
// 	25	String toUpperCase()	returns a string in uppercase.
// 	26	String toUpperCase(Locale l)	returns a string in uppercase using specified locale.
// 	27	String trim()	removes beginning and ending spaces of this string.
// 	28	static String valueOf(int value)	converts given type into string. It is an overloaded method.
