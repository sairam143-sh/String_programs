class string_digits {
    public static void main(String[] args) {
        String str="1234589";
        int i,count=0;
        for(i=0;i<str.length();i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        if(count==str.length())
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}
