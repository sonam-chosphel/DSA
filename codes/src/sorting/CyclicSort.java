package sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic(int[] arr){
        int i =0;
        while(i<=arr.length-1)
        {
            
            if(i != arr[i]-1)
            {
                int j = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else{
                i+=1;
            }
        }
    }

}
