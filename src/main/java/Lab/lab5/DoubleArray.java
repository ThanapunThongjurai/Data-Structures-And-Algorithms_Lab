package Lab.lab5;

import java.util.Scanner;

public class DoubleArray {

    public int[] copyArray(int[] arr) {
        int[] answer = new int[arr.length * 2];
        for (char i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
            answer[i+arr.length] = 0;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d", answer[i]);
        }
        System.out.println("\n debug   "+answer.length);

        return answer;
    }

}
