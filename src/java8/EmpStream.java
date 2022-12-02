package java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmpStream {
    private int id;

   private String name;

    private double salary;

    public EmpStream(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpStream{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<EmpStream> list = Arrays.asList(
                new EmpStream(1,"Max",80000),
                new EmpStream(2,"Peter",6400),
                new EmpStream(3,"Laura",50),
                new EmpStream(4,"Hailey",90000));

        Predicate<EmpStream> empStreamPredicate = empStream -> empStream.getSalary()>10000;

        list.stream().filter(empStreamPredicate).forEach(System.out::println);

    }

}
