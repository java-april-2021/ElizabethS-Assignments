
public class Human {
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;
    @Override
    public String toString() {
        return "A Human object with current strength, stealth, intelligence and health " + this.strength, this.stealth, this.intelligence, this.health;
    }
    public void attack(Human target) {
        target.strength -= this.strength;
    }

    public void steal(Human target) {
        target.stealth -= this.stealth;
    }

}


