class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");   // add text
        sb.insert(5, " Programming"); // insert text
        sb.replace(0, 5, "Hi"); // replace text

        System.out.println(sb);
    }
}
