package javaclasses.localinnerclasses;

public class InnerLocalMain {
    public static void main(String[] args) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(6);
        System.out.println(teacher.getClass());
        boolean result = teacher.excludeStudent(new Student());
        System.out.println(result);
        AbstractTeacher teacher1 = TeacherCreator.createTeacher(777);
        System.out.println(teacher1.getClass());
        result = teacher1.excludeStudent(new Student());
        System.out.println(result);
    }
}
