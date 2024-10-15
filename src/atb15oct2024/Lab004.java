package atb15oct2024;

public class Lab004 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 3;

        int d = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("Biggest number is: " + d);
    }
}
