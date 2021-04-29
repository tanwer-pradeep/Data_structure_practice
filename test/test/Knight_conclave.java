package test;
import java.util.Scanner;

public class Knight_conclave {

    public static void display(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i] + " ");
            }
            System.out.println();
        }
    }

    public static void knight_conclave(int[][] chess, int n, int r, int c, int move){
        if(r >= chess.length || r < 0 || c < 0 || c >= chess[0].length || chess[r][c] != 0) return;
        else{
            chess[r][c] = 1;
            move++;
        }
        if(move == n) display(chess);


        
        // up and right
        knight_conclave(chess, n, r - 2, c + 1, move);

        // right and up call
        knight_conclave(chess, n, r - 1, c + 2, move);

        // right and down call
        knight_conclave(chess, n, r + 1, c + 2, move);

        // down and right
        knight_conclave(chess, n, r + 2, c + 1, move);

        //down and left 
        knight_conclave(chess, n, r + 2, c - 1, move);

        // left and down
        knight_conclave(chess, n, r + 1, c - 2, move);

        // left and up
        knight_conclave(chess, n, r  - 1, c - 2, move);

        // up and left
        knight_conclave(chess, n, r - 2, c - 1, move);

        chess[r][c] = 0;
        move--;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] chess = new int[row][col];

        int number_of_knights = scn.nextInt();

        knight_conclave(chess, number_of_knights, 0, 0, 0);
        scn.close();

    }
}
