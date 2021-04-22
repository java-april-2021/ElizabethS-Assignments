public class Gorilla extends Mammal{
    //Directly call the mammal constructor
    public Gorilla(String name, int energy){
        super("Gorilla", 500);
    }

    public Gorilla eatBanana(){
        this.energy += 10;
        System.out.printf("I am a %s eating a bananna", this.name);
        return this;
    }

    public Gorilla throwSomething(){
        this.energy -= 5;
        System.out.println("I am a gorilla, and I love to throw things.  Oo-oo, aah-aah!");
        return this;
    }

    public Gorilla climb(){
        this.energy -= 10;
        System.out.println("Me, Gorilla, climb!");
        return this;
    }
}