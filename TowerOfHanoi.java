import java.util.*;
public class TowerOfHanoi {
    
    // public static void solved(int n , String src ,  String helper, String dest){
    //     if(n==1){
    //         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //         return;
    //     }
    //     solved(n-1, src, dest, helper);
    //     System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //     solved(n-1, helper, src, dest);
    // } 

    // ?Reverse of a string 
    // public static void reverseString(String name,int index) { 
    //     if(index == -1){ 
    //         return;
    //     }
    //     System.out.print(name.charAt(index));  
    //     reverseString(name, index-1);
    // } 
    
    // ?find the first and last occurrence of a character in a string
    // public static int first = -1;
    // public static int last = -1;
    // public static void findOccurrence(String str, char ch, int idx) {
    //     if(idx == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return ;
    //     }
    //     char currentChar = str.charAt(idx);
    //     if(currentChar == ch){
    //         if(first == -1){
    //             first = idx;
    //         }
    //         last = idx;
    //     }
    //     findOccurrence(str, ch, idx + 1); // Increment index here
    // }

    //? check if an array is sorted (Strickly increasing )
    // public static boolean isSorted(int[] arr,int index){

    //     if(index == arr.length-1){
    //         return true;
    //     }
    //     if(arr[index] < arr[index+1]){
    //         // array is sorted
    //         return isSorted(arr, index+1);
    //     }else{
    //         return false;
    //     }
    // }

    //?Move all "x" to end of the string
    // public static void MoveAllx(String str , int idx,int count , String newString){

    //     if(idx == str.length()){
    //         for(int i=0;i<count;i++){
    //             newString += "x";
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == 'x'){
    //         count++;
    //         MoveAllx(str, idx+1, count, newString);
    //     } else{
    //         newString += currChar;
    //         MoveAllx(str, idx+1, count, newString);
    //     }
    // }

    //? Remove duplicate in string
    public static String removeDuplicate(String str, int index, Map<Character, Integer> countChar) {
        if (index == str.length()) {
            return "";
        }

        char currChar = str.charAt(index);
        if (!countChar.containsKey(currChar) || countChar.get(currChar) == 0) {
            countChar.put(currChar, 1);
            return currChar + removeDuplicate(str, index + 1, countChar);
        }

        countChar.put(currChar, countChar.get(currChar) + 1);
        return removeDuplicate(str, index + 1, countChar);
    }


    public static void  main(String[] args) {
        // int n = 2;
        // solved(n, "A", "B", "C");

        // String name = "Shubham Singh";
        // reverseString(name, name.length() - 1);
        // System.out.println(); // Add a line break for clarity

        // String str = "shubhamsingh";
        // findOccurrence(str, 's', 0);

        // int arr[] = {1,2,3,4,5,5,6,7,8,9};
        // System.out.println(isSorted(arr, 0));

        // String str = "axsbhddnxnnjxxjdx";
        // MoveAllx(str, 0, 0, "");

        String str = "programming";
        Map<Character, Integer> countChar = new HashMap<>();
        String result = removeDuplicate(str, 0, countChar);
        System.out.println("String after removing duplicates: " + result);
    }
}
