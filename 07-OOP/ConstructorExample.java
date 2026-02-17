class Student {
    String name;
    int age;

    // constructor
    Student(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Yash", 20);
        s1.display();
    }
}
