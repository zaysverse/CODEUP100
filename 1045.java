import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f\n",a+b,a-b,a*b,a/b,a%b,(float)a/b);
    }
}
