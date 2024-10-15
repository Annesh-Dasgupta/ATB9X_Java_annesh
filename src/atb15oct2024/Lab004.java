package atb15oct2024;

public class Lab004 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 3;

        int d = (a > b) ? a : (b > c) ? b : (a > c) ? a : c;
        System.out.println(d);
    }
}
