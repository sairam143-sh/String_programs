public class string_builtin
{
    public static void main(String[] arr)
    {
        String s1="welcome to";
        String s2=" telugu web guru guru";
        System.out.println(s1.concat(s2));
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        String s3="hello";
        String s4="HELLO";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(4,7));
        System.out.println(s2.indexOf("web"));
        System.out.println(s2.lastIndexOf("guru"));
        System.out.println(s1.startsWith("w"));
        System.out.println(s1.endsWith("to"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        String s5=" lakki";
        System.out.println(s5.trim());
        String[] res=s1.split("");
        System.out.println(res.length);
        System.out.println(s1.replace("w","l"));
        char a[]=new char[7];
        s2.getChars(2,9,a,0);
        System.out.println(new String(a));
    }
}
