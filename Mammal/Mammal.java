public class Mammal {
    protected String name;
    protected int energy;
    
    
//constructor
    public Mammal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    public int displayEnergy(){
        System.out.println(this.name + " has " + this.energy + " energy left");
        return this.energy;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getEnergy(){
        return this.energy;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }
}

