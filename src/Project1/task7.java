package ProjectHomework;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        // Write a java program to check whether a given number is prime or not?
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter any number");
        int num= scan.nextInt();
        int check=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                check++;
            }
        }
        if (check==2){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}