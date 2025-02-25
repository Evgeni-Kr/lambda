package Lambda;

public class SortClass  implements  Comparable<SortClass>{

    private int number;
    private String name;

    public SortClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SortClass sortClass){
        return this.getNumber()- sortClass.getNumber();
    }

    @Override
    public String toString() {
        return "SortClass{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
