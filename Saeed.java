
import java.util.Random;

public class Saeed {

    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(6);
        int b = rnd.nextInt(6);
        a++;
        b++;
        if (a == b) {
            System.out.format("a= %d\n", a);
            System.out.format("b= %d\n", b);
            System.out.println("****you WON****");
        } else {

            System.out.println("^^^you LOSE^^^");
            System.out.format("a= %d\n", a);
            System.out.format("b= %d\n", b);
        }
    }
}
