package Lambda;

import java.util.Comparator;

public class ComparatorClass implements Comparator<ComparatorClass> {

    private int age;
    private String surname;

    public ComparatorClass(int age, String surname) {
        this.age = age;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public int compare(ComparatorClass cc1, ComparatorClass cc2){
        return 0;
    }

    @Override
    public String toString() {
        return "ComparatorClass{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }
}
