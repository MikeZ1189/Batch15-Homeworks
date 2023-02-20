package ProjectHomework;

public class task4 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int even = 0;
        int[][] numbers = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println("Even numbers are:" + numbers[i][j] + " ");
                }
            }
        }
    }
}