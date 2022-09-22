// Example of equals and Hashcode

import java.util.*;

public class Sample {
    int id;
    String name;
    public Sample(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
        Sample sample = (Sample) o;
        return id == sample.id && Objects.equals(name, sample.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Sample s1=new Sample(1,"Niketh");
        Sample s2=new Sample(1,"Niketh");
        HashSet<Sample> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set);
    }
}
