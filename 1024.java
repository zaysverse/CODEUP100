import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i =0; i<word.length();i++){
            System.out.println("'"+word.charAt(i)+"'");
        }
    }
}
