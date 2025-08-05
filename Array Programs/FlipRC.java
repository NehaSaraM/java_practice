import java.util.Scanner;

class FlipRC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

     
        for (int j = 0; j < c; j++) {
            int temp = mat[0][j];
            mat[0][j] = mat[r - 1][j];
            mat[r - 1][j] = temp;
        }

        
        for (int i = 0; i < r; i++) {
            int temp = mat[i][0];
            mat[i][0] = mat[i][c - 1];
            mat[i][c - 1] = temp;
        }

        System.out.println("Matrix after flipping first and last row & column:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
