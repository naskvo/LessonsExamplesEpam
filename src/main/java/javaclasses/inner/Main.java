package javaclasses.inner;

public class Main {
    Student.Address address = new Student().new Address(); //только если внутренний класс НЕ приватный
    Student student = new Student();
    Student.Address address1 = student.getAddress(); //только если внутренний класс НЕ приватный
}
