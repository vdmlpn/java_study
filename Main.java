import java.util.Scanner;

public class Main{
    static int calcGCD(int num1, int num2) {
        if (num2!=0)
            return calcGCD(num2, num1%num2);
        else 
            return num1;
    }

    public static void main(String []args) {
        System.out.print("Enter the first positive integer value: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter the second positive integer value: ");
        int num2 = sc.nextInt();
        System.out.println ("The greatest common divisor of " +num1+ " and " +num2+ " is " +77calcGCD(num1, num2));

        sc.close();
    
    }
}
