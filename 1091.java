import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str= br.readLine().split(" ");
        int a= Integer.parseInt(str[0]);
        int m= Integer.parseInt(str[1]);
        int d= Integer.parseInt(str[2]);
        int n= Integer.parseInt(str[3]);

        long result = a;

        for(int i=1;i<n;i++){
            result=result*m+d;
        }

        bw.write(String.valueOf(result));

        bw.flush();
    }
}
