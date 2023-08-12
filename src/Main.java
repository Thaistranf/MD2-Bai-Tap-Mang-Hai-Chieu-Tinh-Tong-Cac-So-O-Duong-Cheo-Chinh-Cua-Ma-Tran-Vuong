import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rows;
        int cols;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào một ma trận vuông");
            System.out.print("Nhập số dòng trong ma trận: ");
            rows = sc.nextInt();
            System.out.print("Nhập số cột trong ma trận: ");
            cols = sc.nextInt();
        } while (rows < cols || rows > cols || rows <= 1);

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập giá trị cho arr[%d][%d] = ", i, j);
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        System.out.print(Arrays.deepToString(arr) + " ");

        int total = 0;
        for (int i = 0; i < rows; i++) {
            total += arr[i][i];
        }
        System.out.print("\nTotal = " + total);
    }
}