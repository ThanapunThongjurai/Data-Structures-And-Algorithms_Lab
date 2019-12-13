package Lab.lab3;
import java.util.Scanner;
public class MostNumber {
    public static void main(String[] args) {
        int length = 3;
        double[] Receive = new double[length];
        for(int i = 0 ; i < length ; i++)
        {
            Scanner receive= new Scanner(System.in);
            Receive[i] = receive.nextDouble();
        }
        double Answer = Receive[0];
        for(int i = 0 ; i < length;i++)
        {
            if(Answer < Receive[i])
            {
                Answer = Receive[i];
            }
        }
        System.out.println(Answer);

    }
}
