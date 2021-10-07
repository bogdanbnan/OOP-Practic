package Task1;

public class Person
{
    int age = 2;
    String fullName = "Lemon";

    public static void main(String[] args)
    {
        Person person = new Person();
        person.talk();
        person.move();

        person.fullName = "Orange";
        person.talk();
        person.move();
    }

    public void talk()
    {
        System.out.println("*" + fullName + " is talking");
    }

    public void move()
    {
        System.out.println("*" + fullName + " is moving");
    }
}
