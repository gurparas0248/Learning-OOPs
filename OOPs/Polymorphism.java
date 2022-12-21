package OOPs;

import java.sql.SQLOutput;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)1.5,(float)2.5));
        System.out.println(cal.sum(1,2,4));

        Deer d=new Deer();
        d.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animals{
    void eat(){
        System.out.println("Eats grass");
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
