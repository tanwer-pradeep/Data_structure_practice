package test;

import java.util.Scanner;

public class infix {
    public static int Evolution(String exp){
        return -1;
    }
    
    public static String postfix(String exp){
        return "none";
    }
    
    
    
    
    public static String prefix(String exp){
        return "none";
    }
    
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        System.out.println(Evolution(exp));
        System.out.println((postfix(exp)));
        System.out.println((prefix(exp)));
        scn.close();
        
    }
}
