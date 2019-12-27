package Lab.test;

public class GenerateArray {
    public int[] gen(int n, int x) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = x;
        }
        return answer;
    }

}
