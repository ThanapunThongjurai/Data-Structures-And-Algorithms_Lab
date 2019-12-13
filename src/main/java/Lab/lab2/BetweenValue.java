package Lab.lab2;
import java.util.Scanner;
public class BetweenValue {
    public static void main(String[] args) {
        Scanner cherprang = new Scanner(System.in);
        int charam = cherprang.nextInt();
        if(charam >= 10 && charam <= 100)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
