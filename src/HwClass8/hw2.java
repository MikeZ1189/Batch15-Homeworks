package HwClass8;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Apply for a credit card?");
        while (input.next().equalsIgnoreCase("No")) {
            System.out.println("Apply for a credit");
        }
    }
}

