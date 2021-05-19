import java.util.Scanner;

public class Tower_of_Hanoi {

    public static void toh(int n, int src, int dest, int helper){
        if(n == 0) return;

        // keep the faith on toh(n-1) that it will shift n-1 disks from source
        // to helper using destination.
        toh(n - 1, src, helper, dest);

        // now perform the rest functionality i.e., shift the remaining last disk
        // from source to destination
        System.out.println(n+"["+src+ "->"+dest+"]");

        // now again with the help of  toh(n-1) move the n-1 disk back from helper
        // to destination using source
        toh(n -1, helper, dest, src);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helper = scn.nextInt();

        toh(n, src, dest, helper);
        scn.close();
    }
}
