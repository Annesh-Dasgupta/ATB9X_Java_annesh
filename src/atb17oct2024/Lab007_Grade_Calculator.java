package atb17oct2024;

import java.util.Scanner;

public class Lab007_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the students name : ");
        String name = sc.next();
        System.out.println("Enter the Marks : ");
        int number = sc.nextInt();
        if(number >=90 && number <= 100){
            System.out.println("A");
        } else if (number >=80 && number <= 89) {
            System.out.println("B");
        } else if (number >=70 && number <= 79) {
            System.out.println("C");
        } else if (number >=60 && number <= 69) {
            System.out.println("D");
        } else if (number >=0 && number <= 59) {
            System.out.println("F");
        } else{
            System.out.println("Try Next year");
        }
        sc.close();
    }

}
