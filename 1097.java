import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[][] baduk = new int[19][19];

        for(int i=0;i<19;i++) {
            for(int j=0;j<19;j++){
                baduk[i][j]= sc.nextInt();
            }
        }
        int n = sc.nextInt();

        int x,y;
        for(int i=0;i<n;i++)
        {
            x= sc.nextInt()-1;
            y=sc.nextInt()-1;
            for(int j=0;j<19;j++)
                baduk[x][j] = (baduk[x][j]==0) ? 1: 0;
            for(int j=0;j<19;j++)
                baduk[j][y] = (baduk[j][y]==0) ? 1: 0;
        }

        for(int i=0;i<19;i++)
        {
            for(int j=0;j<19;j++)
            {
                System.out.printf("%d ",baduk[i][j]);
            }
            System.out.println();
        }
    }
}
