package Stacks_and_Queues;
import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {

    public static boolean isduplicate(String exp){
        Stack<Character> st = new Stack<Character>();

        for(int i = 1; i < exp.length(); i++){
            if(exp.charAt(i) != ')'){
                st.push(exp.charAt(i));
            }else{
                if(st.peek() == '('){
                    return true;
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String exp = scn.nextLine();
        System.out.println(isduplicate(exp));
        scn.close();
    }
    
}
