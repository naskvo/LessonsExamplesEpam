package javaclasses.inner;

public class Student {
    private int studentId;
    private String name;
    private int group;
    private String faculty;
    private Address address;
    public class Address /*extends, implements */ {
        private String city;
        private String street;
        private int houseId;
        private int flatId;
        private String email;
        private String skype;
        private long phoneNumber;
        //нельзя объявить статическое поле или метод или стат логич блок, если класс внутренний не статический
        //лучше не делать вложенность классов больше одного!

        public Address() {
        }

        public void action(){
            group = 101; //внутренний класс (даже приватные) поля и методы класса-владельца видит
        }
    }

    public Student() {
    }

    public Address getAddress() {
        return address;
    }

    public void operation() {
        address.city = "Kiiv"; //класс-владелец не видит ничего из внутреннего класса без создания объекта, даже публичные
    }
}
