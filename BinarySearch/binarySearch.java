package binary_search;

public class Binary_Search {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8};
        int key =11;
        int left =0;
        int right =arr.length-1;
        boolean found = false;
       while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid]<key)
            {
                left = mid +1;
            }
            else if(arr[mid] >key)
            {
                right = mid-1;

            }
            else if(arr[mid] == key)
            {
                System.out.println("the element "+key+" is present");
                found = true;
                break;
            }
            
        }
        if(!found){
                System.out.println("ele not found");
                
            }
    }

}
