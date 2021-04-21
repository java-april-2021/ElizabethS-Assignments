public class Gorilla extends Mammal{
    //Directly call the mammal constructor
    public Gorilla(){
        super("Gorilla", 500)
    }

    public void eatBanana(){
        System.outprintf("I am a %s eating a bananna", this.species);
    }
}