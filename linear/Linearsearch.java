public class LinearSearch {
    public static void main(String[] args) throws Exception {
       int[] nums = {1,24,54,2,34,-91,0};
       int key = 24;
       int ans = linearsearch(nums, key);
       System.out.println(ans);

    }

    static int linearsearch(int arr[],int target)
    {
        if(arr.length ==0)
        {
            return -1;
        }

        for(int i =0 ;i<arr.length;i++)
        {
            int element = arr[i];
            if(element == target)
            {
                return i;
            }
        }
        return -1;

    }
}
