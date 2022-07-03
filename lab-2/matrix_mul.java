import java.util.*;

class matrix_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, n1, m2, n2;
        System.out.print("Enter M1: ");
        m1 = sc.nextInt();
        System.out.print("Enter N1: ");
        n1 = sc.nextInt();
        System.out.print("Enter M2: ");
        m2 = sc.nextInt();
        System.out.print("Enter N2: ");
        n2 = sc.nextInt();
        if (m1 == n1 && n1 == m2 && m2 == n2) {
            int[][] a = new int[m1][n1];
            int[][] b = new int[m1][n1];
            int[][] c = new int[m1][n1];
            System.out.println("Matrix A ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print("Enter " + i + j + ":");
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix B ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print("Enter " + i + j + ":");
                    b[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < n2; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}