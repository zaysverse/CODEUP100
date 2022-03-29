import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str= br.readLine().split(" ");
        int a= Integer.parseInt(str[0]);
        int b= Integer.parseInt(str[1]);
        int c= Integer.parseInt(str[2]);

        int day=1;
        while(a!=0 || b!=0 || c!=0){
         if(day%a==0 && day%b==0 && day%c==0)
             break;
         day++;
        }
        bw.write(String.valueOf(day));

        bw.flush();
    }
}
