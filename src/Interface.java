class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void speak(){
        System.out.println("Hello sir!");
    }
}
public class Interface {
    public static void main(String[] args) {
        Human prajwal = new Human();
        prajwal.sleep();
        prajwal.eat();
        Monkey m = new Monkey();
        m.jump();
        m.bite();
        prajwal.speak();
    }
}
