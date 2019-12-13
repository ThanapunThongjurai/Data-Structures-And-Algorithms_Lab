package Lab.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Count3 {
    public static void main(String[] args) {
        Scanner raai = new Scanner(System.in);
        String box = raai.next();

        int count = 0;
        for(int i = 0 ; i < box.length();i++)
        {
            if(box.charAt(i) == '3')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
