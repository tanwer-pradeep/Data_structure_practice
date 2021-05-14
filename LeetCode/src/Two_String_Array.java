// ref :- https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
import java.util.Scanner;




public class Two_String_Array{
    
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "", str2 = "";
        
        for(int i = 0; i < word1.length; i++){
            str1 += word1[i];
        }

        for(int i = 0; i < word2.length; i++){
            str2 += word2[i];
        }
        // if(str1 == str2) return true; use ".equals" instead of "=="
        if(str1.equals(str2)) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        String[] word1 = new String[n1];
        String[] word2 = new String[n2];
        for(int i = 0; i < n1; i++){
            word1[i] = scn.next();
        }

        for(int i = 0; i < n2; i++){
            word2[i] = scn.next();
        }

        System.out.println(arrayStringsAreEqual(word1, word2));

        scn.close();
    }
}