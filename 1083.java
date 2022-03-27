import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            switch (i)
            {
                case 3: case 6: case 9:
                    System.out.println("X");
                    break;
                default:
                    System.out.println(i);
            }
        }
    }
}
