import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = br.readLine().split(" ");
        double h=Integer.parseInt(a[0]);
        double b=Integer.parseInt(a[1]);
        double c=Integer.parseInt(a[2]);
        double s=Integer.parseInt(a[3]);

        /*
        double result=h*b*c*s/(Math.pow(2,23));
        result= Math.round(result*10)/10.0;
        bw.write(String.valueOf(result)+" MB");
         */

        double result=h*b*c*s/(Math.pow(2,23));
        bw.write(String.format("%.1f MB",result));

        bw.flush();
    }
}
