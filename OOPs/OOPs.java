package OOPs;

public class OOPs {
    public static void main(String[] args) {
        Pen p1=new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc=new BankAccount();
        myAcc.username="Paras";
        myAcc.setPass("blablabla");
    }

}

class BankAccount{
    public String username;
    private String password;
    public void setPass(String pwd){
        password=pwd;
    }
}

class Pen{
    //properties
    String color;
    int tip;

    //functions
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip =newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int maths){
        percentage=(phy+chem+maths)/3;
    }
}