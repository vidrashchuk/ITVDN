import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {
        int rows, i, j;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows you would like to see in Triangle");
        rows = input.nextInt();

        for (i = 1; i <= rows; i++) {

            for (j = 1; j <= i; ++j) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }
    }
}

