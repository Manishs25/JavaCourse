package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    int id;

    String name, address;

    public StudentInfo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    public static void main(String[] args) {
        StudentInfo obj1 = new StudentInfo(1, "Max", "Satara");
        StudentInfo obj2 = new StudentInfo(2, "Peter", "Pune");
        StudentInfo obj3 = new StudentInfo(3, "Vaibhav", "California");

        List<StudentInfo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        list.forEach(studInfo -> System.out.println(studInfo.id + " " + studInfo.name + " " + studInfo.address));
    }
}

