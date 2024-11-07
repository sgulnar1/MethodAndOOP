package package2;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected   Person() {

    }

    public void method() {
        System.out.println("Person method");
    }
}
