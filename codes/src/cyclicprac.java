import java.util.*;


public class cyclicprac {
    public static void main(String[] args)
    {
        int[] arr = {2,1,2}; 
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
       ArrayList<Integer> missing =new  ArrayList<>(missing(arr));
       System.out.println("the missing number is "+missing);
       System.out.println("the dupicate number in the array :"+duplicate(arr));
    }
    static void sort(int[] arr)
    {
        int i = 0;
        while(i<arr.length )
        {
            int j=arr[i]-1;
            if(arr[j] != arr[i] && arr[i]<=arr.length)
            {
                int temp = arr[i];
                arr[i]  = arr[j];
                arr[j]  = temp;

               

            }
            else{
                i++;

            }
        }

    }

    static List<Integer> missing(int[] arr)
    {
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1 != i)
            {
                temp.add(i+1);
            }
        }
        return temp;

    }
    static int duplicate(int[] arr)
    {
        
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] != i+1)
           {
            return arr[i];
           }
        }
        return -1;
    }
   
}