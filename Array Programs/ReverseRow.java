import java.util.Scanner;

class ReverseRow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r, c;

        int MAT[][] = new int[50][50];

        System.out.print("Enter the number of rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                MAT[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(MAT[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The Resultant Matrix with Reversed Rows is:");
        for (int i = 0; i < r; i++) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(MAT[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
