package app;

public class MatrixNormalizer {
    public static void main(String[] args) {
        int[][] testData = {
            {-1, -2,},
            {-3, -4, }
        };

        printArray(testData);

        normalizeData(testData);
        printArray(testData);
    }

    private static void normalizeData(int[][] data) {
        int rows = data.length;

        for (int i = 0; i < rows; i++) {
            int columns = data[i].length;
            for (int j = 0; i < columns; i++) {
                if (data[i][j] < 0) {
                    data[i][j] = 0;
                }
            }
        }
    }

    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
