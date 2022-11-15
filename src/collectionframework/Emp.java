package collectionframework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Emp {
    int id;

    String name;

    String address;

    public Emp(int id, String name, String address) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public static void main(String[] args) {
        Emp obj1 = new Emp(1, "max", "pune");
        Emp obj2 = new Emp(1, "max", "pune");
        Emp obj3 = new Emp(2, "Dominic", "satara");

        Set<Emp> set = new HashSet<>();

        set.add(obj1);
        set.add(obj2);
        set.add(obj3);

        set.forEach(emp -> System.out.println(emp.id + " " + emp.name + " " + emp.address));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Objects.equals(name, emp.name) && Objects.equals(address, emp.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
