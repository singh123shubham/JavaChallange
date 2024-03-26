public class StringExample {


    // count Occureance
    public static int countOccurrences(String str ,String subString){
        if(str==null  || str.isEmpty() || subString.isEmpty() || subString == null) return 0;  
        
        int count =0;
        int index = 0;

        while((index = str.indexOf(subString,index)) != -1 ){
            count++;
            index+=subString.length();
        }
        return count;
    }
    public static void main(String[] args) {
        String str1 = "ababababa";
        String subString = "aba";

        int result = countOccurrences(str1,subString);
        System.out.println(result);
    }
}
