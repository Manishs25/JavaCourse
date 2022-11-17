package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo implements Comparable<EmployeeDemo> {

    int id;
    String name;
    String address;

    public EmployeeDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public static void main(String[] args) {

        EmployeeDemo obj1 = new EmployeeDemo(1, "Manish", "Satara");
        EmployeeDemo obj2 = new EmployeeDemo(22, "Tejas", "Pune");
        EmployeeDemo obj3 = new EmployeeDemo(44, "Amit", "Satara");
        EmployeeDemo obj4 = new EmployeeDemo(66, "Jeevan", "Pune");

        List<EmployeeDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        Collections.sort(list);

        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });

    }

    //For sorting Integers values
//    @Override
//    public int compareTo(EmployeeDemo o) {
//
//        if(this.id==o.id){
//            return 0;
//        }else if(this.id>o.id){
//            return 1;
//        }else {
//            return -1;
//        }

    // For sorting string values
    @Override
    public int compareTo(EmployeeDemo o) {
        return this.name.compareTo(o.name);
    }
}

