package javaclasses.invokingparentclassconstructors;

public class Person extends Object {
    private int id;
    private String name = "";
    public Person() {
        super();
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
