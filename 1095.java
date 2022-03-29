import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min=23, num;

        for(int i=0;i<n;i++)
        {
            num=sc.nextInt();
            if(num<min) min=num;
        }
        System.out.println(min);
    }
}
