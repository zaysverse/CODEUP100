import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=90)
            System.out.println('A');
        else if(n>=70)
            System.out.println('B');
        else if(n>=40)
            System.out.println('C');
        else
            System.out.println('D');
    }
}