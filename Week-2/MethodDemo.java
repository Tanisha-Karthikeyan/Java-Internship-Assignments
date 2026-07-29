class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    
    void sound()
    {
        System.out.println("Dog barks");
    }
}

public class MethodDemo
{
    
    void add(int a, int b)
    {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c)
    {
        System.out.println("Sum = " + (a + b + c));
    }

    public static void main(String[] args)
    {
        MethodDemo obj = new MethodDemo();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        Animal a = new Dog();
        a.sound();
    }
}