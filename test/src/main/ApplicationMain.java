package main;

import child.Student;
import child.Teacher;
import parent.Human;

public class ApplicationMain {

    public static void main (String[] args) {
        Human human1 = new Human();
//        System.out.println (human1.name);
        Teacher teacher1 = new Teacher ();
//
//        teacher1.setName ("Faysal");
//        System.out.println (teacher1.getName ());

        Human cynthia = new Human ();

        cynthia.name = "Cynthia";
        cynthia.sayHello();

    }
}
