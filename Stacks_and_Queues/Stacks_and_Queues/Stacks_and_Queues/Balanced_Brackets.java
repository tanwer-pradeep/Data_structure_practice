package Stacks_and_Queues;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {

    public static boolean isBalanced(String exp){
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else if(c == ')' || c == '}' || c == ']'){
                if(st.size() == 0) return false;
                else if(c == ')' && st.peek() == '('){
                    st.pop();
                }else if (c == '}' && st.peek() == '{') st.pop();
                else if (c == ']' && st.peek() == '[') st.pop();
                else return false;
            }
        }
        if(st.size() == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String exp = scn.nextLine();
        System.out.println(isBalanced(exp));
        scn.close();
    }
}
