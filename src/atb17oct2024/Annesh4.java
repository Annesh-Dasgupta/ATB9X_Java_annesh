package atb17oct2024;

import java.util.Scanner;

public class Annesh4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Number is :" + number);
        if(number%2==1&& number >=1 || number <=20){
            System.out.println("Weird");
        } else if (number%2==0 && number >=2 && number <=5 || number >20) {
            System.out.println("Not Weird");
        }
        else {
            System.out.println("please check number");
        }
        sc.close();
    }

}
