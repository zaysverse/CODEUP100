import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int l,d,x,y;

        int[][] board = new int[h][w];

        for(int i=0;i<n;i++)
        {
            l = sc.nextInt();
            d = sc.nextInt();
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;

            if(d==0)
            {
                for(int j=0;j<l;j++)
                    board[x][y+j] = (board[x][y+j]==0) ? 1: 0;
            }
            else
            {
                for(int j=0;j<l;j++)
                    board[x+j][y] = (board[x+j][y]==0) ? 1: 0;
            }
        }

        for(int i =0;i<h;i++){
            for(int j=0;j<w;j++)
                System.out.printf("%d ",board[i][j]);
            System.out.println();
        }
    }

}
