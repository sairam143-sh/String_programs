class anagram {
    public static void main(String[] args) {
        String str1="gum";
        String str2="mug";
        int count=0,i,j;
        if(str1.length()==str2.length())
        {
            for(i=0;i<str1.length();i++)
            {
                for(j=0;j<str2.length();j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        count++;
                    }
                }
            }
        }
        else
        {
            System.out.println("not anagram");
        }
        if(count==str1.length())
        {
            System.out.println("anagram");
        }

    }
}