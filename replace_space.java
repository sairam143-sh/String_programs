
class replace_space {
    public static void main(String[] args) {
        String str1="hello world";
        int i;
        for(i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)==' ')
            {
                System.out.print("%");
            }
            else
            {
                System.out.print(str1.charAt(i));
            }
        }


    }
}