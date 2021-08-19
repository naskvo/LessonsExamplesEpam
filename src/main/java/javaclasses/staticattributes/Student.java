package javaclasses.staticattributes;

public class Student {
    static { //вызывается самым первым всегда
        faculty = "MMF";
        int a = 1/0;
    }
    static String faculty; //написание getter setter для статического поля не явл-ся хорошей практикой
    private long studentId;
    private String name = "";
    private int yearOfStudy;

    public Student(long studentId) {
        this.studentId = studentId;
    }

    public static void convertFaculty(String head) {
        System.out.println(head + " " + faculty.toLowerCase());
        //к нестатическим полям обращаться не может, а также к this
    }
}
