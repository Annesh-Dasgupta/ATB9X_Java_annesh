package atb16oct2024;
import java.util.Scanner;

public class Lab006_scanner {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String My_name = sc.next();
        System.out.println("Number One : ");
        int num1 = sc.nextInt();
        System.out.println("Number Two : ");
        int num2 = sc.nextInt();
        System.out.println("Number Three : ");
        int num3 = sc.nextInt();

        int num4 = (num1 > num2 && num1 >num3)?num1:(num2 > num3)?num2:num3;
        System.out.println(num4);

    }
}
