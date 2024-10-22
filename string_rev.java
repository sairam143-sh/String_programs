class string_rev {
    public static void main(String[] args) {
        String s="hello world";
        int length=s.length();
        int i;
        for(i=length-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }

    }
}
