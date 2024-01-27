import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.print("Enter the starting point: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the ending point: ");
        int n2 = sc.nextInt();
        for (i = n1; i <= n2; i++) {
            boolean isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
