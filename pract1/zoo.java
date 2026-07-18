class Animal {
    void makeSound(){
        System.out.println("Animal Makes sound a lot!");
    }
}

class dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog: Barks!");
    }
}

class cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat: Meow! Meow!");
    }
}
public class zoo{
    public static void main(String[] args){
        Animal d = new dog();
        Animal c = new cat();
        d.makeSound();
        c.makeSound();
    }
}