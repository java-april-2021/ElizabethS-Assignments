public class Test {
    public static void main(String[] args){

        Bat Batilda = new Bat("Batilda", 300); 
        Gorilla Gertrude = new Gorilla("Gertrude", 200); 

        System.out.println(Batilda);
        System.out.println(Gertrude);

        Batilda.fly().displayEnergy();
        Batilda.eatHumans().displayEnergy();
        Batilda.attackTown().displayEnergy();
        
        Gertrude.eatBanana().displayEnergy();
        Gertrude.throwSomething().displayEnergy();
        Gertrude.climb().displayEnergy();

    }
}