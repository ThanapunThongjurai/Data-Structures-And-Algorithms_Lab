package Lab.lab3;

import java.util.Scanner;

public class BetweenValue {
    public static void main(String[] args) {
        Scanner FAII = new Scanner(System.in);
        int Bamboo = FAII.nextInt();
        if(Bamboo > 10 && Bamboo < 100)
        {
            System.out.println("ค่าอยู่ระหว่าง 10 และ 100");
        }
        else
        {
            System.out.println("ค่าไม่อยู่ระหว่าง 10 และ 100");
        }
    }
}
