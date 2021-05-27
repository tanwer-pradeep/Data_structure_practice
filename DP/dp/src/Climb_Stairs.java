package dp.src;

import java.util.Scanner;


public class Climb_Stairs{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(paths(n));

        scn.close();
    }

    public static int paths(int stairs){
        int [] ans = new int[stairs + 1];

        for(int i = stairs; i >= 0; i--){
            if(i == stairs) ans[i] = 1;
            else{
                for(int jmp = 1; jmp <= 3 && i + jmp <= stairs; jmp++){
                    ans[i] += ans[i+jmp];
                }
            }
        }

        return ans[0];
    }
}