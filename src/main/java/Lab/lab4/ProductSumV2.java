package Lab.lab4;

import java.util.Scanner;

public class ProductSumV2 {
    public static void main(String[] args) {
        Scanner janis = new Scanner(System.in);
        int fall = 0;
        int answer = 0;
        while (fall != -1) {
            fall = janis.nextInt();
            if (fall != -1) {
                answer = fall + answer;
            }
        }
        System.out.println(answer);
    }

}
