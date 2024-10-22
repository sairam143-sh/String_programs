class palindrome {
    public static void main(String[] args) {
        String s="heleh";
        int length=s.length();
        int i,j=0;
        char[] arr=new char[s.length()];
        for(i=length-1;i>=0;i--)
        {
            arr[j]=s.charAt(i);
            j++;
        }
        if(new String(arr).equals(s))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}