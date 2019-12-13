package Lab.lab5;

import java.util.Scanner;

public class DoubleArray {

    public int[] copyArray(int[] arr) {
        int[] answer = new int[arr.length * 2];
        for (char i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        for (int i = arr.length; i < answer.length; i++) {
            //answer[i] = arr[i - arr.length];
            answer[i] = 0;
        }

        for(int i = 0 ; i < answer.length;i++)
        {
            System.out.printf("%d", answer[i]);
        }


        return answer;
    }

}
