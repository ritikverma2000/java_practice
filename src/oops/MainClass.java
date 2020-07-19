package oops;
class Cat{
    boolean hasFur;
    String color,breed;
    int legs,eyes;
    public void walk(){
        System.out.println("Cat is Walking");
    }
    public void eat(){
        System.out.println("Cat is Eating");
    }
    public void description(){
        System.out.println("My cat has "+legs+" legs"+" and "+eyes+" eyes");
    }
}
class Dog{
    String breed,name;
    public void jump(){
        System.out.println("My dog "+ name +" jumped");
    }
    public void description(){
        System.out.println("my dog name is "+ name +" and its breed is "+ breed);
    }

}

public class MainClass {
    public static void main(String[] args) {
//        Cat cat1=new Cat();
//        cat1.walk();
//        Cat cat2=new Cat();
//        cat2.eat();
//        cat1.legs=3;
//        cat1.eyes=2;
//        cat2.legs=4;
//        cat2.eyes=1;
//        cat1.description();
//        cat2.description();
        Dog husky=new Dog();
        Dog poodle=new Dog();
        husky.breed="Husky";
        husky.name="Browny";
        poodle.breed="Poodle";
        poodle.name=" DoctorStrange";
husky.jump();
husky.description();
poodle.jump();
poodle.description();

    }
}
