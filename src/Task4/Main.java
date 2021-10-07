package Task4;

public class Main
{
    public static int i;
    public static void main(String[] args)
    {
        Dog dog = new Dog("Dog", "bark", "bone", "booth");
        Cat cat = new Cat("Cat", "meow", "fish", "house");
        Horse horse = new Horse("Horse", "neigh", "hay", "stable");
        Veterinarian veterinarian = new Veterinarian();
        Animal animal[] = {dog, cat, horse};

        for(i = 0; i < 3; i++)
        {
            animal[i].makeNoise();
        }
        System.out.println("----------------------------------");
        for(i = 0; i < 3; i++)
        {
            animal[i].eat();
        }
        System.out.println("----------------------------------");
        for(i = 0; i < 3; i++)
        {
            animal[i].sleep();
        }
        System.out.println("----------------------------------");

        for(i = 0; i < 3; i++)
        {
            veterinarian.treatAnimal(animal[i]);
        }
    }
}

class Animal
{
    public String food, location, noise, name;

    void makeNoise()
    {
        System.out.println(name + " says " + noise);
    }

    void eat()
    {
        System.out.println(name + " eat " + food);
    }

    void sleep()
    {
        System.out.println(name + " sleep in " + location);
    }
}

class Dog extends Animal
{
    public Dog(String name, String noise, String food, String loacation)
    {
        this.name = name;
        this.noise = noise;
        this.food = food;
        this.location = loacation;
    }
}

class Cat extends Animal
{
    public Cat(String name, String noise, String food, String loacation)
    {
        this.name = name;
        this.noise = noise;
        this.food = food;
        this.location = loacation;
    }
}

class Horse extends Animal
{
    public Horse(String name, String noise, String food, String loacation)
    {
        this.name = name;
        this.noise = noise;
        this.food = food;
        this.location = loacation;
    }
}

class Veterinarian
{
    void treatAnimal(Animal animal)
    {
        System.out.println("Info for treat " + animal.name + " - \n Food: " + animal.food + "\n Location: " + animal.location + "\n");
    }
}