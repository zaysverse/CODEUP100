import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char en = sc.next().charAt(0);
        char a = 'a';

        do {
            System.out.print(a+" ");
            a++;
        } while (a <= en);

    }
}
