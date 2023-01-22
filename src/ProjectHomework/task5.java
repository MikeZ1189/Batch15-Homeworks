package ProjectHomework;

public class task5 {
    public static void main(String[] args) {
        // Create a 2D array of integers. Develop a program which will
        // calculate the sum of  even and odd numbers for that array.
        int even = 0;
        int odd = 0;
        int[][] numbers = {{1, 2, 3, 4},
                           {5, 6, 7, 8}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    even = even + numbers[i][j];
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 != 0) {
                    odd = odd + numbers[i][j];
                }
            }
        }
                    System.out.println("Sum of even numbers is:" + even);
                    System.out.println("Sum of odd numbers is:" + odd);
    }
}
