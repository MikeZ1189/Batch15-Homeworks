package ProjectHomework;

public class task10 {
    public static void main(String[] args) {
        // Write a java program to find the second largest number in the array?
        int [] nums={2,4,6,8,10};
        int max=nums[0];
        int max2=nums[0];

        for (int i=0;i< nums.length;i++){
            if (nums[i]>max){
                max2=max;
                max=nums[i];
            }else if (nums[i]>max2){
                max2=nums[i];
            }
        }System.out.println(max2);
    }
}