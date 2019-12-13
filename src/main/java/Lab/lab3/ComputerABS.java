package Lab.lab3;

import java.util.Scanner;

public class ComputerABS {
    public static void main(String[] args) {
        Scanner r1 = new Scanner(System.in);
        Scanner r2 = new Scanner (System.in);
        int r11 = r1.nextInt();
        int r22 = r2.nextInt();
        int answer = r11 - r22 ;
        if(answer <0)
            answer = answer*-1;
        System.out.println(answer);
    }
}
