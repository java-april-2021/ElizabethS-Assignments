public class Bat extends Mammal{
    //Directly call the mammal constructor
    public Bat(){
        super("Bat", 300)
    }

    public void fly(){
        System.out.println("I am flying");
    }

    public void eatHumans(){
        System.out.printf("I am a %s eating a human", this.species);
    }

    public void attackTown(){
        System.out.printf("I am a %s attacking a town!", this.species);
    }
}