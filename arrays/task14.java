import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        if (k < 0) {
            k = k + n;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[(i + k) % n] = a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
