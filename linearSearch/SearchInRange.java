public class SearchInRange {
    public static void main(String[] args)
    {
         String name = "alex";
        char target = 'x';
        int start = 0;
        int end = 2;
        boolean bool = search(name,target,start,end);

        System.out.println(bool);
    }
    static boolean search(String name, char target,int start , int end)
    {
        if(name.length()==0)
        {
            return false;

        }
        for(int i =start ; i<end;i++)
        {
            if(target == name.charAt(i))
            {
                return true;

            }
        }
        //for(char ch :name.toCharArray()){
        //if(ch == target)
        //return true;
        //}
        return false;


    }
}
