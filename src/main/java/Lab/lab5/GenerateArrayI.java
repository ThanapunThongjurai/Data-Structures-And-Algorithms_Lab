package Lab.lab5;

public class GenerateArrayI {
    public int[] gen(int n ,int i)
    {
        int[] answer = new int[n];
        for(int j = 0 ; j < answer.length ; j++)
        {
            answer[j] = i;
            System.out.printf("%d",answer[j]);
        }
        return answer;
    }

}
