import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] baduk = new int[19][19];

        for(int i=0;i<n;i++)
        {
            String[] xy =br.readLine().split(" ");
            baduk[Integer.parseInt(xy[0])-1][Integer.parseInt(xy[1])-1]=1;
        }
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                System.out.printf("%d ",baduk[i][j]);
            }
            System.out.println();
        }
    }
}
