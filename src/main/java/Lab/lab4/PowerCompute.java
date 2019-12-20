package Lab.lab4;

import java.util.Scanner;

public class PowerCompute {

    public static void main(String[] args) {
        Scanner faii = new Scanner(System.in);
        int a = faii.nextInt();
        int b = faii.nextInt();
        //System.out.println(Mpow(5,a));
        System.out.println(mpow(5, a) + mpow(3, b));

    }

    private static int mpow(int y, int x) {
        int answer = 1;
        for (int i = 1; i <= x; i++) {
            answer = answer * y;
        }
        return answer;
    }

}
