package Lab.lab5;

public class CountString {
    public int count(String str)
    {
        int answer = 0;
        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i) == 'M')
            {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
