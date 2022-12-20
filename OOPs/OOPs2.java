package OOPs;

import java.sql.SQLOutput;

public class OOPs2 {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.name="Paras";
        s1.roll=8;
        s1.pass="abcd";

        Student1 s2=new Student1(s1);
        s2.pass="xyz";
    }

}

class Student1{
    String name;
    int roll;
    String pass;

    //copy constructor
    Student1(Student1 x){
        this.name=x.name;
        this.roll=x.roll;
    }

//    non-parameterized constructor
    Student1(){
        System.out.println("Constructor is called");
    }


//    parameterized constructor
    Student1(String name){
        this.name=name;
   }
   Student1(int roll){
        this.roll=roll;
   }

}
