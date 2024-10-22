class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        str.append(" World");
        System.out.println(str);
        str.insert(2,"y");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.replace(2,4,"ab");
        System.out.println(str);
        str.delete(2,4);
        System.out.println(str);
        System.out.println(str.length());

    }
}