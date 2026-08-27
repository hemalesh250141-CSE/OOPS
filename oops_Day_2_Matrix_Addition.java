import java.util.Scanner;

class Matrix {
    int[][] a = new int[2][2];

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    void add(Matrix m) {
        System.out.println("Matrix Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((a[i][j] + m.a[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        System.out.println("Enter Matrix 1:");
        m1.getData();

        System.out.println("Enter Matrix 2:");
        m2.getData();

        m1.add(m2);
    }
}
