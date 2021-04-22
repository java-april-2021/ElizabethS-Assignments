public class Bat extends Mammal{
    //Directly call the mammal constructor
    public Bat(String name, int health){
        super("Bat", 300);
    }

    //function
    public Bat fly(){
        this.energy -= 50;
        System.out.println("I am flying");
        return this;
    }

    public Bat eatHumans(){
        this.energy += 25;
        System.out.println("I am eating a human");
        return this;
    }

    public Bat attackTown(){
        this.energy += 100;
        System.out.printf("I am attacking a town!");
        return this;
    }
}