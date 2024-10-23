package atb23oct2024;

import java.util.Scanner;

public class Lab13calfunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum is: " + sum(a,b));
        System.out.println("sub is : " + sub(a,b));
        System.out.println("mul is : " + mul(a,b));
        System.out.println("div is : " + div(a,b));
    }

    static int sum(int a , int b){
        return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static int div(int a, int b){
        return a * b;
    }


}
