package Lab.lab2;
import java.util.Scanner;
public class CircleComputer {
    public static void main(String[] args) {
        Scanner r1 = new Scanner(System.in);
        double r11 = r1.nextInt();
        System.out.println("เส้นรอบวง =" +2*r11 * Math.PI);
        System.out.println("พื้นที่  =" +r11 * r11 *Math.PI);


    }
}
