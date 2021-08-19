package javaclasses.invokingparentclassconstructors;

public class Student extends Person {
    private int yearOfStudy;

    public Student(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, String name, int yearOfStudy) {
        super(id, name);
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, int yearOfStudy) {
        this(yearOfStudy); // обращается к своему конструктору, а не к-ру суперкласса
    }
}
