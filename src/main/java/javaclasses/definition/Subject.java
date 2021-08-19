package javaclasses.definition;

public class Subject {
    private long subjectId;
    private String name;

    public Subject(long subjectId, String name) {
        super();
        this.subjectId = subjectId;
        this.name = name;
    }
    //private - из любого метода только этого класса
    //без ключевого слова - private + другим классам в этом пакете
    //protected - без кл слова + этот сабкласс в др пакете
    //public - любой класс в любом пакете

    //конструкторы не переопределяются, поэтому, например, abstract (что означает, что метод будет переопределен в подклассе) стоять не может
    //конструкторы не наследуются, поэтому final тоже нельзя
    //static - конструктор статическим быть не может! абсурд
    //synchronized (блокируется объект этого класса), но это конструктор, они будут себя блокировать, абсурд
    //native - тоже нельзя

    public Subject() {
    }

/*    public Subject() {
        super();
    } //такой конструктор как бы создается по умолчанию, если конструктор не определен вообще*/

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        if (subjectId != subject.subjectId) return false;
        return name != null ? name.equals(subject.name) : subject.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (subjectId ^ (subjectId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", name='" + name + '\'' +
                '}';
    }
}
