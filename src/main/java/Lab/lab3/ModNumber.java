package Lab.lab3;
import java.util.Scanner;
public class ModNumber {
    public static void main(String[] args) {
        Scanner FAII = new Scanner(System.in);
        int Bamboo = FAII.nextInt();
        if(Bamboo > 1000 && Bamboo % 5 == 0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("flase");
        }
    }
}
