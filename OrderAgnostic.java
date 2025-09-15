package binary_search;

public class OrderAgnostic {
    public static void main (String[] args)
    {
        int[] arr = {9,7,5,3,1};
        int key = 1;
        int res = binary(arr,key); 
        if (res==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at "+res);
    }
     static int binary(int arr[],int key)
    {
       int left = 0;
       int right = arr.length-1;
       
        boolean isasc = arr[left]<arr[right];

        // if(arr[left]<arr[right])
        // {
        //     isasc = true;
        // }
        // else{
        //     isasc = false;
        // }

       while(left<=right)
       {
        int mid = left +(right-left)/2;
        if(arr[mid]==key)
        {
           return mid;

        }
        if(isasc){
             if(key<arr[mid])
        {
            right =mid-1;
        }
        else if(key>arr[mid])
        {
            left = mid+1;
        }
        }
        else{
            if(key>arr[mid])
        {
            right =mid-1;
        }
            else if(key<arr[mid])
        {
            left = mid+1;
        }
        }
        

       }
       return -1;

    }


}
