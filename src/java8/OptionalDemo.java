package java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //optional is used to handle null pointer exception
        Student student = new Student(1, null, "Pune");
        if (student.name != null) {
            System.out.println(student.name.toUpperCase());
        } else {
            System.out.println("Name is null");
        }
//        Optional<String> s1 = Optional.empty();
//        System.out.println(s1.get());

//        Optional<String> s2 = Optional.of(student.name);
//        System.out.println(s2);

        Optional<String> s3 = Optional.ofNullable(student.name);
        if (s3.isPresent()) {
            System.out.println(s3.get());
        } else {
            System.out.println("offNullable");
        }
    }
}

class Student {
    int id;

    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}