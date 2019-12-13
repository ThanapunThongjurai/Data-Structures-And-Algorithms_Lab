package Lab.lab4;
import java.util.Scanner;
public class PowerCompute {
    public static void main(String[] args) {
        Scanner FAII = new Scanner(System.in);
        int a = FAII.nextInt();
        int b = FAII.nextInt();
        //System.out.println(Mpow(5,a));
        System.out.println(Mpow(5,a)+Mpow(3,b));

    }
    static int Mpow(int y,int x)
    {
        int answer = 1;
        for(int i = 1 ; i <= x; i++)
        {
            answer = answer *y;
        }
        return answer;
    }
}
