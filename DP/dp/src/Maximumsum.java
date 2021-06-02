package dp.src;

// refrence : -https://pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/maximum-sum-non-adjacent-elements-official/ojquestion
import java.util.*;

public class Maximumsum {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        // logic 
        int inc = 0, exc = 0;
        
        for(int i= 0; i < n; i++){
            if(i == 0) {
                inc = arr[i];
                exc = 0;
            }else{
                int newex = Math.max(exc,inc);
                int newinc = exc + arr[i];
                
                inc = newinc;
                exc = newex;
            }
        }
        
        System.out.println(Math.max(inc, exc));
        scn.close();
    }
}
