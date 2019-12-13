package Lab.lab5;

public class CopyArray {

        public void CopyFiveFirst(int[] arr1,int[] arr2)
        {
            for(int i = 0 ; i<5;i++)
            {
                arr2[i] = arr1[i];
                System.out.printf("%d",arr2[i]);
            }

        }

}
