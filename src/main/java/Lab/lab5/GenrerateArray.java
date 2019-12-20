package Lab.lab5;

public class GenrerateArray {
    public double[] gen(int n) {
        double[] answer = new double[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Math.random();
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }

}
