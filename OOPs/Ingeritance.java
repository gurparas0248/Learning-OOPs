package OOPs;

public class Ingeritance {
    public static void main(String[] args) {


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
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}



//derived class
//class Fish extends Animal{
//    int fins;
//    void swim(){
//        System.out.println("Swims in water");
//    }
//}