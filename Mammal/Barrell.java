public class Barrel implements Attackable{
    private String name;
    private int health;

    public Barrel(String name){
        this.name = name;
        this.health = 20;
    }

    public void setName(string name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
