package dp.src;

// refrence : -https://pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/maximum-sum-non-adjacent-elements-official/ojquestion
import java.util.*;

public class Maximumsum {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // logic
        // int inc = 0, exc = 0;

        // for(int i= 0; i < n; i++){
        // if(i == 0) {
        // inc = arr[i];
        // exc = 0;
        // }else{
        // int newex = Math.max(exc,inc);
        // int newinc = exc + arr[i];

        // inc = newinc;
        // exc = newex;
        // }
        // }

        // System.out.println(Math.max(inc, exc));

        // logic 2
        
        maximumsum(arr, 0, 0, new HashMap<String,Integer>());

        scn.close();
    }

    public static int maximumsum(int[] arr, int idx, int sum, HashMap<String,Integer> hm){
        
        if(idx >= arr.length) return sum;
        else if(hm.containsKey(idx+"@"+sum)==true) 
        {
            hm.put(idx+"@"+sum, Math.max(hm.get(idx+"@"+sum), sum));
            return hm.get(idx+"@"+sum);
        }
    
        int inc = maximumsum(arr, idx + 2, sum + arr[idx], hm);
        int exc = maximumsum(arr, idx + 1, sum,hm);
        
        hm.put(idx+"@"+sum,Math.max(inc,exc));
        return  Math.max(inc,exc);
    }
}

