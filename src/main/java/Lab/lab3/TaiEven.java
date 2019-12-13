package Lab.lab3;

import java.util.Scanner;

public class TaiEven {
    public static void main(String[] args) {
        Scanner ClapCher =new Scanner(System.in);
        String numberreceive = ClapCher.next();
        int number = Integer.parseInt(numberreceive);
        char lastchar = numberreceive.charAt(numberreceive.length()-1);
        if(number % 2 == 0)
        {
            System.out.println(number+" เป็นเลขคู่เลขท้ายเป็น "+lastchar);
        }
        else
        {
            System.out.println(number+" เป็นเลขขี่เลขท้ายเป็น "+lastchar);
        }
    }
}
