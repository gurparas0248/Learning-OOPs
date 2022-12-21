package OOPs;

public class Ingeritance {
    public static void main(String[] args) {
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);

    }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;

}

//derived class
//class Fish extends Animal{
//    int fins;
//    void swim(){
//        System.out.println("Swims in water");
//    }
//}