class MethodOverloading {

    // method with 2 parameters
    void add(int a, int b){
        System.out.println("Sum = " + (a + b));
    }

    // overloaded method with 3 parameters
    void add(int a, int b, int c){
        System.out.println("Sum = " + (a + b + c));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
