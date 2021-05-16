// ref :- https://leetcode.com/problems/replace-all-digits-with-characters/

import java.util.Scanner;

public class All_digit_to_character {

    public static String  replaceDigits(String s){
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i % 2 == 0){
                ans += c + "";
            }else{
                int c1 = (int)c - 48 + (int)s.charAt(i - 1);
                char c2 = (char) c1;
                ans += c2 + "";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        System.out.println(replaceDigits(input));

        scn.close();
    }
    
}
