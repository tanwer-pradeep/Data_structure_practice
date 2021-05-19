import java.util.Scanner;

public class PrintIncreasing {

    public static void print(int n){
        if(n == 0)return;
        print(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        print(n);
        scn.close();
    }
}
