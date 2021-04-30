
import java.util.Scanner;
public class Circle_maniac{

    public static String circle_maniac(int x1, int y1, int x2, int y2, int r1, int r2){
        if(x1 == x2 && y1 == y2){
            if(r1 == r2)return "overlaps";
            else return "concentric";
        }
        // if(x1 == x2 && y1 == y2 && r1 == r2);
        
        double distance_btwn_centres = Math.pow(((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2))), 0.5);
        if(distance_btwn_centres == r1 + r2) return "touches at 1 point";
        if(distance_btwn_centres < r1 + r2) return "touches at 2 point";
        if(distance_btwn_centres > r1 + r2) return "far-apart";
        return "";
        
        
    }
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        // cordinates of first circle
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        
        // cordinates of second circle
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        
        // radii of both circles
        int r1 = scn.nextInt();
        int r2 = scn.nextInt();
        
        System.out.println(circle_maniac(x1,y1,x2,y2, r1, r2));
    }

}