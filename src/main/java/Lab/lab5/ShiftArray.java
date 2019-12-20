package Lab.lab5;

public class ShiftArray {
    public int[] shiftRight(int[] arr) {
        int[] answer = new int[arr.length + 1];
        answer[0] = 0;
        for (int i = 1; i < answer.length; i++) {
            answer[i] = arr[i - 1];

        }
        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d", answer[i]);
        }
        return answer;
    }

}
