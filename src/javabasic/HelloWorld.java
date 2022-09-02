package javabasic;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Son son = new Son();

    }
}

class Father {
    private String name;
    private int age;

    public void father(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Son extends Father {

}
