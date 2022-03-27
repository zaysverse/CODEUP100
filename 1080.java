import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        for(int i=1;;i++){
            sum+=i;
            if(sum>=n){
                System.out.println(i);
                break;
            }
        }

    }
}
