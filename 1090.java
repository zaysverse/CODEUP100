import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str= br.readLine().split(" ");
        int a= Integer.parseInt(str[0]);
        int r= Integer.parseInt(str[1]);
        int n= Integer.parseInt(str[2]);

        long result = (long) (a*Math.pow(r,n-1));
        bw.write(String.valueOf(result));

        bw.flush();
    }
}
