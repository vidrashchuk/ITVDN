import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {
        int rows, i, j;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows in Triangle");
        rows = in.nextInt();

        for (i = 1; i <= rows; i++) {

            for (j = 1; j <= i; ++j) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }
    }
}

