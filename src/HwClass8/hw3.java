package HwClass8;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int start=input.nextInt();
        System.out.println("Please enter 2nd number");
        int end=input.nextInt();
        int even=0;
        int odd=0;
        for (int i = start; i <=end; i++) {
            if (i % 2 == 0) {
                even += i;
            } else if (i % 2 != 0) {
                odd += i;
            }
        }
            System.out.println("Sum of even numbers= "+even);
            System.out.println("Sum of odd numbers= "+odd);
        }
    }

