package by.epam.learn.main;

class Course {}
class BaseCourse extends Course {}
class FreeCourse extends BaseCourse{}
class OptionalCourse extends Course {}

public class LearnMainInstanceOf {
    public static void doAction(Course c) {
        if (c instanceof BaseCourse) {
            System.out.println("for BaseCourse and FreeCourse");
        }
        else if (c instanceof OptionalCourse) {
            System.out.println("for OptionalCourse");
        }
        else {
            System.out.println("for Course or null");
        }
    }

    public static void main(String[] args) {
        Course course = new BaseCourse();
        doAction(course);
    }
}
