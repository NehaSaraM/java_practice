import java.util.Scanner;

class DiagonalSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int sum = 0;

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

  
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; 
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i]; 
            }
        }

        System.out.println("Sum of diagonal elements: " + sum);
        sc.close();
    }
}
