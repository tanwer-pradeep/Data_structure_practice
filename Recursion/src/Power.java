import java.util.Scanner;

public class Power {
    //power logritmic

    public static int power(int x, int n){
        if(n == 0) return 1;
        
        if(n % 2 == 0) return(power(x, n/2) * power(x, n/2));
        return (power(x, n/2) * power(x, n/2) * x);
    }
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x, n));
        scn.close();
    }
}

