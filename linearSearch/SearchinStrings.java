public class SearchinStrings {
    public static void main(String[] args)
    {
        String name = "alex";
        char target = 'x';
        boolean bool = search(name,target);

        System.out.println(bool);
    }
    static boolean search(String name, char target)
    {
        if(name.length()==0)
        {
            return false;

        }
        for(int i =0 ; i<name.length();i++)
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
