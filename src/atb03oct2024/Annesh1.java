package atb03oct2024;

public class Annesh1 {
    public void property(String x){
        System.out.println("string check : "+x);
    }
    public void property(int x){
        System.out.println("Int check : " + x);
    }
    public static void main(String[] args) {
        Annesh2 a2 = new Annesh2();
        a2.property(56);
    }
}
class Annesh2 extends Annesh1{
    public void property(){
        System.out.println("sdsdsdfsfssdsd");
    }

}



