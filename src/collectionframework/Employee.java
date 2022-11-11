package collectionframework;

import java.util.LinkedList;

public class Employee {
        int id;

        String name;

        String address;

        int salary;

        public Employee(int id,String name, String address,int salary){
            this.id=id;
            this.name=name;
            this.address=address;
            this.salary=salary;
        }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Manish","Los Angeles",250000);
        Employee emp2 = new Employee(2,"Amit","California",300000);
        Employee emp3 = new Employee(3,"Tejas","Paris",400000);

        LinkedList<Employee> list = new LinkedList<>();

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        list.forEach(Employee -> System.out.println(Employee.id+" "+Employee.name+" "+Employee.address+" "+Employee.salary));
    }
}
