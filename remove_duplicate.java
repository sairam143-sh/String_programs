class remove_duplicate {
    public static void main(String[] args) {
        String str="hello world";
        int i,count=0,j;
        for(i=0;i<str.length();i++)
        {
            for(j=0;j<str.length();j++)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    count++;
                }
            }
            if(count==str.length()-1)
            {
                System.out.print(str.charAt(i));
            }
            count=0;
        }

    }
}