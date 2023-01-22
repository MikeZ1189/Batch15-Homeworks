package ProjectHomework;

public class task3 {
    public static void main(String[] args) {
        // Create a 2D array of integer values. Print the sum of all numbers.
        int [] [] arr={{2,4,6},
                       {8,10,12},
                       {14,16,18}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}