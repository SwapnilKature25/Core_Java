/*
       1   2   3
       6   5   4
       7   8   9
      12  11  10
      13  14  15
 */
public class Pattern1 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int cols = 3; // Number of columns
        int num = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Fill left to right
                for (int j = 0; j < cols; j++) {
                    System.out.print(num + "  ");
                    num++;
                }
            } else {
                // Fill right to left
                int temp = num + cols - 1;
                for (int j = 0; j < cols; j++) {
                    System.out.print(temp + "  ");
                    temp--;
                }
                num += cols;
            }
            System.out.println();
        }
    }
}
