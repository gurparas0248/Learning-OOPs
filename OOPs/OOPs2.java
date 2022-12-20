package OOPs;

import java.sql.SQLOutput;

public class OOPs2 {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        Student1 s2=new Student1("Paras");
        Student1 s3=new Student1(12);
    }

}

class Student1{
    String name;
    int roll;

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
