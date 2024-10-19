package atb17oct2024;
import java.util.Scanner;

public class Suvankar_triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st length: ");
        int length1 = scanner.nextInt();

        System.out.print("Enter 2nd length: ");
        int length2 = scanner.nextInt();

        System.out.print("Enter 3rd length: ");
        int length3 = scanner.nextInt();

        scanner.close();

        classifyTriangle(length1, length2, length3);
    }

    private static void classifyTriangle(int length1, int length2, int length3) {
        if (isEquilateral(length1, length2, length3)) {
            System.out.println("The triangle is equilateral.");
        } else if (isIsosceles(length1, length2, length3)) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }

    private static boolean isEquilateral(int length1, int length2, int length3) {
        return length1 == length2 && length2 == length3;
    }

    private static boolean isIsosceles(int length1, int length2, int length3) {
        return length1 == length2 || length2 == length3 || length1 == length3;
    }

}
