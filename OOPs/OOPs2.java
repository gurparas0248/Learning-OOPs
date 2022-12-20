package OOPs;

import java.sql.SQLOutput;

public class OOPs2 {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.name="Paras";
        s1.roll=8;
        s1.pass="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=40;

        Student1 s2=new Student1(s1);
        s2.pass="xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]); 
        }
    }

}

class Student1{
    String name;
    int roll;
    String pass;
    int marks[];


    //Deep copy constructor
    Student1(Student1 x){
        marks=new int[3];
        this.name=x.name;
        this.roll=x.roll;
        for (int i = 0; i <marks.length; i++) {
            this.marks[i]=x.marks[i];
        }

    }


    //Shallow copy constructor
//    Student1(Student1 x){
//        marks=new int[3];
//        this.name=x.name;
//        this.roll=x.roll;
//        this.marks=x.marks;
//    }

//    non-parameterized constructor
    Student1(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }


//    parameterized constructor
    Student1(String name){
        marks=new int[3];
        this.name=name;
   }
   Student1(int roll){
       marks=new int[3];
        this.roll=roll;
   }

}
