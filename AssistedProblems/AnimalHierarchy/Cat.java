package out.gla.Inheritance.AssistedProblems.AnimalHierarchy;
public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows");
    }
}