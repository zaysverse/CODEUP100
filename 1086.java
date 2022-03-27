import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = br.readLine().split(" ");

        double r=Integer.parseInt(a[0]);
        double g=Integer.parseInt(a[1]);
        double b=Integer.parseInt(a[2]);
        double result=r*g*b/Math.pow(2,23);
        bw.write(String.format("%.2f MB",result));

        bw.flush();
    }
}
