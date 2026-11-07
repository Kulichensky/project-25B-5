import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean changed = true;
        while (changed) {
            changed = false;
            int[] b = new int[n];
            int size = 0;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && a[j] == a[i]) {
                    j++;
                }
                int len = j - i;
                if (len < 3) {
                    for (int k = i; k < j; k++) {
                        b[size] = a[k];
                        size++;
                    }
                } else {
                    changed = true;
                }
                i = j;
            }
            a = b;
            n = size;
        }
        System.out.println(n);
    }
}
