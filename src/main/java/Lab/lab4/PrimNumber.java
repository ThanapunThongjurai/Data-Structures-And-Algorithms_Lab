package Lab.lab4;
import java.util.Scanner;

import java.util.Scanner;
public class PrimNumber {
    public static void main(String[] args) {
        Scanner jennis = new Scanner(System.in);
        int number = jennis.nextInt();
        int prim = 0;
        for(int i = 1 ; i <= number ; i++)
        {
            if(number % i == 0)
            {
                System.out.println(i);
                prim++;
            }
        }
        if(prim == 2)
        {
            System.out.println("prim number");
        }
        else
        {
            System.out.println("not prim number");
        }
    }
}
