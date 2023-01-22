package ProjectHomework;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // Using Scanner create an array of countries.
        // When an array is created, retrieve all values from it and while retrieving those values print capital for each country.
        // (use 2 different loops).
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 countries");
        String[] countries = new String[4];
        countries[0] = scan.nextLine();
        countries[1] = scan.nextLine();
        countries[2] = scan.nextLine();
        countries[3] = scan.nextLine();
        String[] capital = {"Washington DC", "Madrid", "London", "Rome"};
        for (int i = 0; i < countries.length; i++) {
                    System.out.println("Capital of " + countries[0] + " is " + capital[0]);
                    System.out.println("Capital of " + countries[1] + " is " + capital[1]);
                    System.out.println("Capital of " + countries[2] + " is " + capital[2]);
                    System.out.println("Capital of " + countries[3] + " is " + capital[3]);
                }
            }
        }



