package javaclasses.immutables;

import java.util.StringJoiner;

public class ImmutableSubject {
    private int Id;
    private String name;

    public ImmutableSubject(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutableSubject that = (ImmutableSubject) o;

        if (Id != that.Id) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ImmutableSubject.class.getSimpleName() + "[", "]")
                .add("Id=" + Id)
                .add("name='" + name + "'")
                .toString();
    }
}
