package dp.src;

public class Count_binary {


    public static int BinaryCount(int tar){

        // logic 1
        //     int[][] ans = new int[2][tar + 1];

        //     for(int i = 1; i <= tar; i++){
        //         if(i == 1){
        //             ans[0][1] = ans[1][1] = 1;
        //         }
        //         else{
        //             ans[0][i] = ans[1][i-1];
        //             ans[1][i] = ans[0][i-1] + ans[1][i-1];
        //         }
        //     }
        //     return ans[0][tar]+ans[1][tar];
        // 

        // logic 2
        int countEnd0 = 1;
        int countEnd1 = 1;
        for(int i = 2; i <= tar; i++){
            int temp0 = countEnd1;
            int temp1 = countEnd0 + countEnd1;

            countEnd0 = temp0;
            countEnd1 = temp1;
        }
        return countEnd0 + countEnd1;
        
    }
    
}
