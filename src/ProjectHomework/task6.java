package ProjectHomework;

public class task6 {
    public static void main(String[] args) {
        // Write a program to swap 2 numbers without a temporary variable?
        int a=10;
        int b=20;
        System.out.println("Value of a before swapping="+a);
        System.out.println("Value of b before swapping="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a after swapping="+a);
        System.out.println("Value of b after swapping="+b);
    }
}