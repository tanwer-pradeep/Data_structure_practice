import java.util.Scanner;

// ref : - https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-ita-official/ojquestion

public class BuySell_stock{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = scn.nextInt();

        int bp = arr[0], sp = arr[0], profit = 0;

        for(int day = 1; day < n; day++){
            if(sp >= bp){
                sp = arr[day];
            }
            else{

            }
        }


        scn.close();
    }
}