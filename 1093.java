import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] att = new int[23];

        for(int i=0;i<n;i++)
            att[sc.nextInt()-1]++;

        for (int i=0;i<att.length;i++)
            System.out.println(att[i]);
    }
}
