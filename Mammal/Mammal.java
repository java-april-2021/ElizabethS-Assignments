public class Mammal {
    protected String species;
    protected int health;
    static int totalHealth;
    }
    
    public Mammal(String species, int health){
        this.species = species;
        this.health = health;
    }

    public String getSpecies(){
        return this.species;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void attack(Attackable target){
        //decrament health
        int targetsHealth = target.getHealth();
        targetsHealth -= 5;
        target.setHealth(targetsHealth);
        System.out.println(this.species + " smacked the target for " + target.getHealth());
    }
}