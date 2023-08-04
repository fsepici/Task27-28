package task28.task08Poly;

public class Main {
    public static void main(String[] args) {
        Animal animal1=new Cat();
        Animal animal2=new Dog();
        Animal animal3=new Horse();

        animal1.run(45," kilometres");
        animal1.run(54);
        animal1.makeSound();

        animal2.makeSound();
        animal3.makeSound();


    }
}
