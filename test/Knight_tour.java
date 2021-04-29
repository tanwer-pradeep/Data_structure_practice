import java.util.Scanner;

public class Knight_tour{

    public static void display(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " \t");
            }
            System.out.println();
        }
    }

    public static void knighttour(int[][] chess, int row, int col, int movenumber){
        if(row >= 0 && row < chess.length && col >= 0 && col < chess[0].length && chess[row][col] == 0) chess[row][col] = movenumber;
        else return;

        if(movenumber == chess.length * chess[0].length){
            display(chess);
            System.out.println("\n \n\n");
        }

        // up and right
        knighttour(chess, row - 2, col +1, movenumber + 1);
        // right and up
        knighttour(chess, row - 1, col + 2, movenumber + 1);
        // right and down
        knighttour(chess, row + 1, col + 2, movenumber + 1);
        // down and right
        knighttour(chess, row + 2, col + 1, movenumber + 1);
        // down and left
        knighttour(chess, row + 2, col - 1, movenumber + 1);
        // left and down
        knighttour(chess, row + 1, col - 2, movenumber + 1);
        // left and up
        knighttour(chess, row - 1, col - 2, movenumber  + 1);
        // up and left
        knighttour(chess, row - 2, col - 1, movenumber + 1);
        chess[row][col] = 0;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] chess = new int[n][n];
        knighttour(chess, row, col, 1);
        scn.close();
    }


}