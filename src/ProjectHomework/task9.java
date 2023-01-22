package ProjectHomework;

public class task9 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array?
        int [] nums={2,4,6,8,10};
        int max=nums[0];
        int min=nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>max) {
                max = nums[i];
            }
            }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<min)
            {min=nums[i];
            }
        }
        System.out.println("The maximum number is =" + max);
        System.out.println("The minimum number is =" + min);
    }
}