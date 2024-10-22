class upper_lower {
    public static void main(String[] args) {
        String str="HELLO world";
        int i;
        for(i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            }
            else
            {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }

    }
}
