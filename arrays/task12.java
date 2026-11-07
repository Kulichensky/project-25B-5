import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int pos = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] >= x) {
                pos = pos + 1;
            }
        }
        System.out.println(pos);
    }
}
