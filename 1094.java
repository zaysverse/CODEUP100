import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] att = new int [n];

        for(int i=0;i<n;i++) att[i]=sc.nextInt();
        for(int i=n-1;i>=0;i--) System.out.printf("%d ",att[i]);
    }
}
