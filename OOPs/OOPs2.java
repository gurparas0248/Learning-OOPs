package OOPs;

public class OOPs2 {
    public static void main(String[] args) {
        Student1 s1=new Student1("Paras");
        System.out.println(s1.name);

    }

}

class Student1{
    String name;
    int roll;

    Student1(String name){
        this.name=name;
    }

}
