package atb17oct2024;

import java.util.Scanner;

public class Lab008_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st length : ");
        int length_One = sc.nextInt();
        System.out.println("Enter 2nd length : ");
        int length_Two = sc.nextInt();
        System.out.println("Enter 3rd length : ");
        int length_Three = sc.nextInt();
        if(length_One==length_Two &&length_Two==length_Three&&length_One==length_Three){
            System.out.println("The triangle is equilateral ↕ ");
        } else if (length_One==length_Two || length_Two==length_Three || length_One==length_Three) {
            System.out.println("The triangle is isosceles ← ");
        }else {
            System.out.println("scalene");
        }
    }
}
