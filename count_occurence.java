class count_occurence{
    public static void main(String[] args) {
        String s="how are you";
        char[] arr=new char[s.length()];
        int i,j=0,d=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                arr[j]=s.charAt(i);
                j++;
                d++;
            }
        }
        for(i=0;i<d;i++)
        {
            System.out.print(arr[i]+"");
        }
        System.out.println();
        int arr1[]=new int[d];
        for(i=0;i<d;i++)
        {
            int count=1;
            if(arr1[i]==-1)
            {
                continue;
            }
            for(j=i+1;j<d;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr1[j]=-1;
                }
            }
            arr1[i]=count;
        }
        for(i=0;i<d;i++)
        {
            if(arr1[i]!=-1)
            {
                System.out.println("element "+arr[i]+" frequency "+arr1[i]);
            }
        }
    }
}
