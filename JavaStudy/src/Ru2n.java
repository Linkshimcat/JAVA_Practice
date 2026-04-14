import java.util.Scanner;

public class Ru2n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = a - c;

        System.out.println(b_square);
    }
}