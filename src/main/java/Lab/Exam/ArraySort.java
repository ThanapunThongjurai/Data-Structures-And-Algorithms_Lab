package Lab.Exam;

public class ArraySort {
    public static void main(String[] args) {
        int [] Da = {1,2,3,4,5,6,7,8,9};
        ArraySort As = new ArraySort();
        boolean temp = As.isSort(Da);
        System.out.println(temp);
    }

    public boolean isSort(int[]arr) {
        boolean check = true;
        for (int i = 0 ;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                check = false;
            }
        }
        return  check;
    }
}
