//  ref :- https://www.codechef.com/JUNE21C/problems/SHROUTE

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Shorest_path {
    public static void main(String[] args) {
        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            long T = Long.parseLong(br.readLine());
            
    
            while(T-- > 0){
                String[] l1 = br.readLine().split("\\s+"); // first line contains N and M
                String[] l2 = br.readLine().split("\\s+"); // second Line contains an array of cities == N
                String[] l3 = br.readLine().split("\\s+"); // third line contains an array of Destination == M
    
                long N = Long.parseLong(l1[0]);
                long M = Long.parseLong(l1[1]);
    
                
    
                long[] cities = new long[(int)N];
                long[] destination = new long[(int)M];
    
                for(long i = 0; i < cities.length; i++){
                    cities[(int)i] = Integer.parseInt(l2[(int)i]);
                }
                
                for(long i = 0; i < destination.length; i++){
                    destination[(int)i] = Integer.parseInt(l3[(int)i]);
                }
                
    
            }
        }
        catch(Exception e){
            System.out.println(e);
        } 

        
    }
}
