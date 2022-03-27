import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = br.readLine().split(" ");

        int count=0;
        for(int i = 0; i<Integer.parseInt(a[0]); i++)
        {
            for(int j = 0; j<Integer.parseInt(a[1]); j++)
            {
                for(int k = 0; k < Integer.parseInt(a[2]); k++){
                    bw.write(i+" "+j+" "+k+"\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
