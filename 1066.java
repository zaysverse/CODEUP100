import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc=new int[3];

        for(int i =0;i<3;i++)
            abc[i]=sc.nextInt();

        for (int i : abc) {
            if(i%2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}