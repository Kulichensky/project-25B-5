import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
