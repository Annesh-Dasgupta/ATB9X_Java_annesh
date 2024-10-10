package atb03oct2024;

public class Lab003 {
    public void cal(int num, int num2){
//        int num = 20;
//        int num2 = 10;
        System.out.println("Add Result: " + (num + num2));
        System.out.println("subtract Result: " + (num - num2));
        System.out.println("MUL Result: " + (num * num2));
        System.out.println("Division Result: " + (num / num2));
    }


public static void main(String[] args) {
    Lab003 l3 = new Lab003();
    l3.cal(40,10);

    }
}
