package child;

import parent.Human;

public class Student extends Human {

    public String roll;
    public String universityName;


    public void sayHello(){
        System.out.println ("Hello, I am from the Student Class");
    }
}
