import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next(),16);

        for(int i=1;i<=0xF;i++)
            System.out.printf("%X*%X=%X\n",n,i,n*i);
    }
}
