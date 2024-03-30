class Animal {

    public void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method in Dog
    }
}



// Inheritance is a mechanism that allows a new class to inherit properties and methods of an existing class.
// This promotes code reusability and establishes a relationship between the parent class (also known as the superclass) and the child class (subclass).