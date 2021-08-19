package javaclasses.localinnerclasses;

public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) {
        class Rector extends AbstractTeacher {
            public Rector(int id) {
                super(id);
            }

            @Override
            public boolean excludeStudent(Student student) {
                if (student != null)
                    return true;
                else return false;
            }
        }
        if (isRector(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }

    private static boolean isRector(int id) {
        return id==6;
    }
}
