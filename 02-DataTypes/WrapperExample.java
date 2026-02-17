class WrapperExample {
    public static void main(String[] args) {

        int num = 10;

        // converting primitive to wrapper
        Integer obj = Integer.valueOf(num);

        // converting wrapper to primitive
        int value = obj.intValue();

        System.out.println("Wrapper object: " + obj);
        System.out.println("Primitive value: " + value);
    }
}
