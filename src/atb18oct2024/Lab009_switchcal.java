package atb18oct2024;

import java.util.Scanner;

public class Lab009_switchcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int Num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int Num2 = sc.nextInt();
        System.out.println("select the sign : ");
        char sign = sc.next().charAt(0);
        switch (sign){
            case '+' :
                System.out.println("addition is : ");
                System.out.println(Num1 + Num2);
                break;
            case '-' :
                System.out.println("subtract is : ");
                System.out.println(Num1 - Num2);
                break;
            case '*' :
                System.out.println("multiplication is : ");
                System.out.println(Num1 * Num2);
                break;
            case '/' :
                System.out.println("division is : ");
                System.out.println(Num1 * Num2);
                break;
            default:
                System.out.println("check Sign ");
        }

    }
}
